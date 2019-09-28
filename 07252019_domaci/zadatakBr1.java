import java.util.Scanner;

public class zadatakBr1 {

	public static void main(String[] args) {

		int n, privremeno, cifra, obrnutiBr = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		n = sc.nextInt();
		sc.close();

		privremeno = n;
		while (privremeno != 0) {
			cifra = privremeno % 10;
			obrnutiBr += cifra;
			obrnutiBr *= 10;
			privremeno /= 10;
		}
		obrnutiBr /= 10;
		if (n == obrnutiBr) {
			System.out.println("Uneti broj jeste palindrom");
		} else {
			System.out.println("Uneti broj nije palindrom");
		}
	}

}
