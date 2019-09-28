import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {

		int unetiBroj, cifra, suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unos");
		unetiBroj = sc.nextInt();
		sc.close();

		int broj = unetiBroj;
		while(broj != 0) {
			cifra = broj%10;
			suma = suma + cifra * cifra * cifra;
			broj /= 10;
		}

		if(unetiBroj == suma){
			System.out.println("Broj je Armstrongov ");
		}
		else {
			System.out.println("Broj nije Armstrongov");
		}
	}

}
