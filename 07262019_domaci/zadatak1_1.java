import java.util.Scanner;

public class zadatak1_1 {

	public static void main(String[] args) {

		double privremeno, suma = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Unesite " + i + ". broj:");
			privremeno = sc.nextDouble();
			if (privremeno >= 0) {
				suma += privremeno;
			} else {
				break;
			}
		}
		sc.close();
		System.out.println("Suma unetih pozitivnih brojeva: " + suma);
	}
}
