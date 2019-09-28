import java.util.Scanner;

public class prviZadatak {

	public static void main(String[] args) {
		int broj;
		double suma = 0;

		Scanner sc= new Scanner(System.in);
		System.out.println("Prvi broj");
		broj = sc.nextInt();
		suma= suma + broj;
		System.out.println("Drugi broj");
		broj = sc.nextInt();
		suma= suma + broj;
		System.out.println("Treci broj");
		broj = sc.nextInt();
		suma = suma + broj;
		sc.close();

		double srednjaVrednost = suma / 3;
		System.out.println("Srednja vrednost je " + srednjaVrednost);

	}

}
