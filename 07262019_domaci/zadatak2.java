import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {

		int n, cifra, maxCif = 0, privremeno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite cifru N: ");
		n = sc.nextInt();
		sc.close();

		privremeno = n;
		while (privremeno != 0) {
			cifra = privremeno % 10;

			if (cifra == 9) {
				maxCif = 9;
				break;
			}
			if(cifra>maxCif){
				maxCif = cifra;
			}
			privremeno/=10;
		}
		System.out.println("Najveca cifra broja " + n + " je: " + maxCif);
	}

}
