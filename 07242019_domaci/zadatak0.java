import java.util.Scanner;

public class zadatak0 {

	public static void main(String[] args) {
		String figura;
		double p = 0, o = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite naziv figure:");
		figura = sc.nextLine();

		switch(figura) {
		case "kvadrat":
			System.out.println("Unesite stranicu kvadrata:");
			double a = sc.nextDouble();
			p = a*a;
			o = 4*a;
			break;
		case "pravougaonik":
			System.out.println("Unesite stranice pravougaonika:");
			a = sc.nextDouble();
			double b = sc.nextDouble();
			p = a*b;
			o = 2*a + 2*b;
			break;
		case "krug":
			System.out.println("Unesite poluprecnik kruga:");
			double r = sc.nextDouble();
			p = r*r*Math.PI;
			o = 2*r*Math.PI;
			break;
		}

		sc.close();

		System.out.println("Povrsina figure je " + p + ", a obim je: " + o);
	}

}
