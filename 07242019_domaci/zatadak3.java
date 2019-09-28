import java.util.Scanner;

public class zatadak3 {

	public static void main(String[] args) {

		String figura;
		double p=0, o=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Figura: ");
		figura = sc.nextLine();


		switch(figura){
		case "Krug":System.out.println("Unesi poluprecnik kruga");
		double r = sc.nextDouble();
		p=r*r*Math.PI;
		o=2*r*Math.PI;
		break;

		case "Kvadrat":System.out.println("Unesi stranicu kvadrata");
		double a = sc.nextDouble();
		p=a*a;
		o=4*a;
		break;

		case "Pravougaonik":System.out.println("Unesi stranice pravougaonika");
		a = sc.nextDouble();
		double b = sc.nextDouble();
		p=a*b;
		o=2*a+2*b;
		break;

		default:System.out.println("Nepravilan unos!");
		}
		sc.close();
		System.out.println("Povrsina figure je "+ p + ", a obim je " + o);
	}



	}