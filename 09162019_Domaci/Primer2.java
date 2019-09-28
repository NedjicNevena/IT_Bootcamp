import java.util.HashMap;

public class Primer2 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
		mapa.put(1, 2);
		mapa.put(2, 3);
		mapa.put(3, 5);
		mapa.put(4, 4);
		mapa.put(5, 5);
		mapa.put(6, 2);
		mapa.put(7, 4);
		mapa.put(8, 3);
		mapa.put(9, 5);
		mapa.put(10, 2);
		mapa.put(11, 4);
		mapa.put(12, 4);
		mapa.put(13, 2);

		brojNepar(mapa);

	}

	public static void brojNepar(HashMap<Integer, Integer> mapa) {
		for (int broj : mapa.values()) {
			int brojac = 0;

			for (int values : mapa.values()) {
				if (mapa.get(values) == broj) {
					brojac++;
				}
			}

			if (brojac % 2 != 0) {
				System.out.println(brojac);
				break;
			}

		}

	}

}
