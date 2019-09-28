import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj N:");
		int n = sc.nextInt();
		sc.close();

		trougao(n);
	}

	static void trougao(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}