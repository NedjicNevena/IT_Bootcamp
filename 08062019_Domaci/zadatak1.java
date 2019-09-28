import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza:");
		int n = s.nextInt();

		int[] niz = new int[n];
		System.out.println("Uneiste elemente niza: ");
		for (int i = 0; i < n; i++) {
			niz[i] = s.nextInt();
		}

		System.out.println("Unesite broj koji treba proveriti:");
		int br = s.nextInt();

		s.close();

		boolean uNizu = brUNizu(br, niz);

		if (uNizu) {
			System.out.println("Broj " + br + " postoji u nizu.");
		} else {
			System.out.println("Broj " + br + " ne postoji u nizu.");
		}

	}

	static boolean brUNizu(int br, int[] niz) {

		boolean uNizu = false;

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == br) {
				uNizu = true;
			}
		}

		return uNizu;

	}
}
