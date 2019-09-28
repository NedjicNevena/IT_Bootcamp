import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {

		Dictionary dy = new Dictionary("jdbc:sqlite:src\\Dictionary.db");
		dy.connect();

		HashMap<String, String> dictionaryMap = dy.putInMap();

		Book b = new Book();
		b.readBook();

		HashMap<String, String> newDictionary = b.compareBook(dictionaryMap);

		System.out.println(newDictionary.size());

		dy.putInTable(newDictionary);

		dy.countWords(dictionaryMap);

		System.out.println();

		Map<String, String> newSorted = dy.sortDictionary(dictionaryMap, newDictionary);

		dy.writeInFile(newSorted);

		dy.disconnect();
	}

}
