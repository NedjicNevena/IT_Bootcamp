import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite A:");
		a = sc.nextInt();
		System.out.println("Unesite B:");
		b = sc.nextInt();
		System.out.println("Unesite C:");
		c = sc.nextInt();
		sc.close();

		int min = minimum (a, b, c);
		System.out.println("Najmanji broj je: " + min);

	}

	static int minimum( int a, int b, int c){
		int min = a;
		if(b < min){
			min = b;
		} else if(c < min){
			min = c;
		}
		return min;
	}
}

