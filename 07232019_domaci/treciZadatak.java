import java.util.Scanner;

public class treciZadatak {

	public static void main(String[] args) {
		int unetiBroj;
		int zbirCifara = 0;
		int cifra;

		Scanner sc= new Scanner(System.in);
		System.out.println("Trocifreni broj");
		unetiBroj = sc.nextInt();
		sc.close();

		int trocifreniBroj = unetiBroj;
		cifra = trocifreniBroj / 100;
		zbirCifara = zbirCifara + cifra;
		trocifreniBroj = trocifreniBroj % 100;
		cifra = trocifreniBroj / 10;
		zbirCifara = zbirCifara + cifra;
		trocifreniBroj = trocifreniBroj % 10;
		zbirCifara = zbirCifara + trocifreniBroj;

		System.out.println("Zbir cifara je " + zbirCifara);

	}

}
