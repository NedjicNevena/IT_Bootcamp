import java.util.Scanner;

public class drugiZadatak {

	public static void main(String[] args) {

		int r;
		double zapremina;
		Scanner sc= new Scanner(System.in);
		System.out.println("Poluprecnik je");
		r = sc.nextInt();
		sc.close();
		zapremina = 4*r*r*r*Math.PI/3;
		System.out.println("Zapremina lopte je " + zapremina);
		
		
	}

}
