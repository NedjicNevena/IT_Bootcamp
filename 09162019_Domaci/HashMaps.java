
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMaps {

	public static void main(String[] args) {

		Map<String, Integer> mapa = new HashMap<String, Integer>();

		mapa.put("Aleksa", 23);
		mapa.put("Bilja", 1);
		mapa.put("Jovica", 23);
		mapa.put("Katarina", 26);
		mapa.put("Svetlana", 19);

		sortiraj(mapa);
	}

	public static void sortiraj(Map<String, Integer> mapa) {
		mapa = new TreeMap<>(mapa);

		for (String key : mapa.keySet()) {
			System.out.println(key + " " + mapa.get(key));
		}
	}

}
