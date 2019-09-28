import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {

		int brojGodine;
		Scanner sc = new Scanner(System.in);
		System.out.println("Broj godine: ");
		brojGodine = sc.nextInt();
		sc.close();

		if(brojGodine%4==0){
			if(brojGodine%100==0){
				if(brojGodine%400==0){
					System.out.println("Prestupna godina");
					}else{
						System.out.println("Nije prestupna godina");
						}
					}else{
						System.out.println("Prestuna godina");
						}
				}else{
					System.out.println("Nije prestupna godina");
			}

	}
}
