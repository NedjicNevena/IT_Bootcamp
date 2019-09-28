import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {

		int novac,index = 1;
		double brojPr, cena, kusur, ukupno = 0;
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("Unesite cenu " + index + ". proizvoda ili (-1), ako proizvoda vise nema:");
			cena = sc.nextDouble();
			if(cena < 0){
				break;
			}
			System.out.println("Unesite kolicinu " + index + ". proizvoda: ");
			brojPr = sc.nextDouble();
			ukupno += cena * brojPr;
			index++;
		} while(cena >= 0);

		ukupno = Math.round(ukupno);
		System.out.println("Ukupna cena proizvoda je: " + ukupno);

		do{
			System.out.println("Koliko Vam je novca dao kupac?");
			novac = sc.nextInt();
			if(novac < ukupno){
				System.out.println("Nedovoljno novca! Ponovite unos...");
			}
		} while(novac < ukupno);

			kusur = novac - ukupno;
			System.out.println("Kusur je: " + Math.round(kusur));
			sc.close();

			int b20, b10, b5, b2, b1;
			b20 = b10 = b5 = b2 = b1 = 0;
			while(kusur >= 1){
				if(kusur >= 20){
					kusur -= 20;
					b20++;
				} else if(kusur >= 10){
					kusur -= 10;
					b10++;
				} else if(kusur >= 5){
					kusur -= 5;
					b5++;
				} else if(kusur >= 2){
					kusur -= 2;
					b2++;
				} else if(kusur >= 1){
					kusur -= 1;
					b1++;
				}
			}
			System.out.println("Da bi ste vratili najmanji broj kovanica potrebno je:");
			System.out.println("\t" + b20 + " od 20 dinara");
			System.out.println("\t" + b10 + " od 10 dinara");
			System.out.println("\t" + b5 + " od 5 dinara");
			System.out.println("\t" + b2 + " od 2 dinara");
			System.out.println("\t" + b1 + " od 1 dinara");

	}
}