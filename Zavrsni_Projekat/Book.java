import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Book {

	public void readBook() {
		try {
			FileReader fr = new FileReader("src\\knjiga");
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter("src\\knjiga2");
			String str;

			while ((str = br.readLine()) != null) {
				str = str.replaceAll("[^a-zA-Z_-]", " ");

				pw.println(str);
			}

			pw.flush();
			pw.close();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public HashMap<String, String> compareBook(HashMap<String, String> d) {
		HashMap<String, String> newWords = new HashMap<String, String>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\knjiga2"));
			String s;

			while ((s = br.readLine()) != null) {
				String[] words = s.split(" ");

				for (String word : words) {
					if (word.length() > 0) {
						if (word.length() == 1) {
							word.toUpperCase();
						} else {
							word = word.toLowerCase();
							word = word.substring(0, 1).toUpperCase() + word.substring(1);
						}

						if (!d.containsKey(word)) {
							newWords.put(word, "");
						}
					}
				}
			}

			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return newWords;
	}
}
