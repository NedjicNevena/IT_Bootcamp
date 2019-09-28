import java.util.Scanner;

public class zadatakBr2 {

	public static void main(String[] args) {

		int m, n, zbir = 0;
		int privremeno;
		String parni = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("m unos:");
		m = sc.nextInt();
		System.out.println("n unos: ");
		n = sc.nextInt();
		sc.close();

		if (m > n) {
			privremeno = m;
			m = n;
			n = privremeno;
		}

		for (int i = m; i <= n; i++) {
			if (i % 2 == 0) {
				zbir += i;
				parni = parni + i + " ";
			}
		}
		System.out.println("Parni brojevi izmedju " + m + " i " + n + " su: " + parni);
		System.out.println("Zbir unetih brojeva je: " + zbir);
	}

}
