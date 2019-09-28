import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj N: ");
		int n = sc.nextInt();
		System.out.println("Unesite broj K: ");
		int k = sc.nextInt();
		sc.close();

		double suma = sumaNiK(n, k);
		System.out.println("Suma je: " + suma);

	}

	static double sumaNiK(int n, int k) {
		double suma = 0;
		double p, q;

		for (int i = 0; i <= n; i++) {
			p = i + 1;
			q = k + i;
			suma += p / q;
		}

		return suma;
	}

}
