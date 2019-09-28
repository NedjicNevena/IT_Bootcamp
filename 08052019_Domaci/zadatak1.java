import java.util.Arrays;
import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		int[] niz = ucitajNiz();

		int nedostajuciBr = nedostajuciBr(niz);
		System.out.println(nedostajuciBr);
	}

	static int[] ucitajNiz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza:");
		int n = sc.nextInt();
		int[] niz = new int[n];

		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	static int nedostajuciBr(int[] niz) {
		Arrays.sort(niz);
		int najmanjiBr = niz[0];
		int nedostajuciBr = 0;
		int privremeniBr = najmanjiBr;

		for (int i = 0; i < niz.length; i++) {
			if (privremeniBr == niz[i]) {
			} else {
				nedostajuciBr = privremeniBr;
				break;
			}
		}
		return nedostajuciBr;
	}
}
