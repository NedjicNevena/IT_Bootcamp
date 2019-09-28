import java.util.Scanner;

public class tribonacciBr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite N: ");
		int n = sc.nextInt();

		if (n <= 37) {
			System.out.println(tribonaci(n));
		} else {
			System.out.println("Broj N mora biti manje ili jednako 37!");
		}
		sc.close();
	}

	static int tribonaci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1 || n == 2)
			return 1;
		else
			return tribonaci(n - 3) + tribonaci(n - 2) + tribonaci(n - 1);
	}

}
