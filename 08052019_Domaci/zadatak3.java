import java.util.Arrays;
import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		double[] niz = ucitajNiz();

		double arSredina = aritmetickaSredina(niz);
		double medijana = medijana(niz);

		System.out.println("Aritmeticka sredina: " + arSredina);
		System.out.println("Medijana: " + medijana);
	}

	static double[] ucitajNiz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza:");
		int n = sc.nextInt();

		double[] niz = new double[n];

		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextDouble();
		}

		return niz;
	}

	static double aritmetickaSredina(double[] niz) {
		double sumaBr = 0;

		for (int i = 0; i < niz.length; i++) {
			sumaBr += niz[i];
		}

		return sumaBr / niz.length;
	}

	static double medijana(double[] niz) {
		double medijana;
		Arrays.sort(niz);

		if (niz.length % 2 == 0) {
			medijana = (niz[niz.length / 2 - 1] + niz[niz.length / 2]) / 2;
		} else {
			medijana = niz[niz.length / 2];
		}

		return medijana;

	}

}
