import java.util.Arrays;
import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza:");
		int n = s.nextInt();
		System.out.println("Unesite gornju granicu brojeva:");
		int gornjaGranica = s.nextInt();

		int[] niz = generisanjeNiza(n, gornjaGranica);
		System.out.println("Generisan niz pseudoslucajnih brojeva je:");
		System.out.println(Arrays.toString(niz));
		System.out.println("Unesite broj koji cemo potraziti u nizu:");
		int br = s.nextInt();

		if (brUNizu(br, niz)) {
			System.out.println("Broj " + br + " postoji u nizu.");
		} else {
			System.out.println("Broj " + br + " ne postoji u nizu.");
		}

		s.close();
	}

	static int[] generisanjeNiza(int n, int gornjaGranica) {
		int[] niz = new int[n];
		for (int i = 0; i < n; i++) {
			niz[i] = (int) (Math.random() * gornjaGranica) + 1;
		}
		return niz;
	}

	static boolean brUNizu(int br, int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			if (br == niz[i]) {
				return true;
			}
		}
		return false;
	}
}
