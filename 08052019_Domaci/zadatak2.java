import java.util.Arrays;
import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		int[] niz = ucitajNiz();
		int[] minMax = minimumMaximum(niz);

		System.out.println(Arrays.toString(minMax));
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

	static int[] minimumMaximum(int[] niz) {
		int min = niz[0];
		int max = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < min) {
				min = niz[i];
			}
			if (niz[i] > max) {
				max = niz[i];
			}
		}
		int[] rez = { min, max };
		return rez;
	}
}
