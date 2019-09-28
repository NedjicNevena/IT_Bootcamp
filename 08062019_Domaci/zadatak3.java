import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza:");
		int n = s.nextInt();
		int[] niz = new int[n];

		System.out.println("Unesite" + n + " elemente niza:");
		for (int i = 0; i < n; i++) {
			niz[i] = s.nextInt();
		}

		double srVrednost = srVrednost(niz);
		System.out.println("Srednja vrednost unetog niza je: " + Math.round(srVrednost));
		veciOdSrVred(niz, srVrednost);

		int el = elNajbliziSrVred(niz, srVrednost);
		System.out.println("Element niza koji je po vrednosti najblizi srednjoj vrednosti je: " + el);

		s.close();

	}

	static double srVrednost(int[] niz) {
		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}
		return suma / niz.length;
	}

	static void veciOdSrVred(int[] niz, double srVrednost) {
		String rez = "";
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > srVrednost) {
				rez += niz[i] + "";
			}
		}
		System.out.println("Brojevi u nizu veci od srednje vrednosti su: ");
		System.out.println(rez);
	}

	static int elNajbliziSrVred(int[] niz, double srVrednost) {
		int el = niz[0];
		double trenutnaRazlika = Math.abs(el - srVrednost);
		for (int i = 1; i < niz.length; i++) {
			if (Math.abs(niz[i] - srVrednost) < trenutnaRazlika)
				;
			el = niz[i];
		}
		return el;
	}

}
