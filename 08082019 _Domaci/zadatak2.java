import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj kolona niza:");
		int brKolona = s.nextInt();
		System.out.println("Unesite broj redova niza:");
		int brRedova = s.nextInt();

		int[][] niz = new int[brRedova][brKolona];

		System.out.println("Unesite " + (brRedova * brKolona) + " elemenata niza:");
		for (int i = 0; i < brRedova; i++) {
			for (int j = 0; j < brKolona; j++) {
				niz[i][j] = s.nextInt();
			}
		}
		System.out.println("Unesite n-ti red niza:");
		int n = s.nextInt();

		int sumaReda = sumaReda(niz, n);

		System.out.println("Suma " + n + ". reda dvodimenzionalnog niza je: " + sumaReda);

		s.close();

	}

	static int sumaReda(int[][] a, int n) {
		int sumaReda = 0;
		for (int j = 0; j < a[n - 1].length; j++) {
			sumaReda += a[n - 1][j];
		}
		return sumaReda;
	}

}
