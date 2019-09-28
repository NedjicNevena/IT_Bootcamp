import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Dictionary {

	Connection conn;
	String connectionString;

	public Dictionary(String connectionString) {
		this.connectionString = connectionString;
	}

	public void connect() {
		try {
			conn = DriverManager.getConnection(connectionString);
			System.out.println("Connection has been established.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
			System.out.println("Connection has been terminated.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public HashMap<String, String> putInMap() {
		HashMap<String, String> d = new HashMap<String, String>();

		try {
			String words = "SELECT word, definition FROM entries";
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(words);

			while (rs.next()) {

				String word = rs.getString("word");
				String definition = rs.getString("definition");
				d.put(word, definition);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return d;
	}

	public void putInTable(HashMap<String, String> newDictionary) {
		try {
			String table = "CREATE TABLE newEntries (word VARCHAR(25) NOT NULL, wordtype VARCHAR(20) NOT NULL, definition VARCHAR NOT NULL)";
			PreparedStatement st = conn.prepareStatement(table);
			st.execute();

			for (String word : newDictionary.keySet()) {
				st = conn.prepareStatement("INSERT INTO newEntries (word,wordtype,definition) VALUES (?,?,?)");
				st.setString(1, word);
				st.setString(2, "");
				st.setString(3, "");
				st.execute();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void countWords(HashMap<String, String> d) {

		Map<String, Integer> countedWords = new HashMap<String, Integer>();

		try {

			BufferedReader br = new BufferedReader(new FileReader("src\\knjiga2"));
			String s;

			while ((s = br.readLine()) != null) {
				String[] words = s.split(" ");

				for (String word : words) {
					if (word.length() > 0) {
						Integer counter = countedWords.get(word);
						countedWords.put(word, (counter == null) ? 1 : counter + 1);
					}
				}
			}

			for (String key : countedWords.keySet()) {
				System.out.println(key + " " + countedWords.get(key));
			}

			System.out.println();

			Map<String, Integer> topTwenty = countedWords.entrySet().stream()
					.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(20).collect(Collectors
							.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

			ArrayList<String> mostUsedWords = new ArrayList<String>();
			for (String key : topTwenty.keySet()) {
				// System.out.println(key + " " + topTwenty.get(key));
				mostUsedWords.add(key);
			}

			System.out.println("20 najcesce koriscenih reci:\n" + mostUsedWords);

			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public TreeMap<String, String> sortDictionary(HashMap<String, String> d, HashMap<String, String> newDictionary) {
		newDictionary.putAll(d);

		TreeMap<String, String> sorted = new TreeMap<String, String>();
		sorted.putAll(newDictionary);

		for (String key : sorted.keySet()) {
			System.out.println(key);
		}
		return sorted;
	}

	public void writeInFile(Map<String, String> sorted) {

		try {
			FileWriter fw = new FileWriter("src\\sortedWords");
			for (String key : sorted.keySet()) {
				fw.write(key + "\n");
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
