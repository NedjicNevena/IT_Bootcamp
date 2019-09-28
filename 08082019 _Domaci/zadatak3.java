import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite string:");
		String str = s.nextLine();
		System.out.println("Unesite karakter:");
		char c = s.next().charAt(0);

		int brPojavljivanja = brKaraktera(str, c);
		System.out.println("Karakter " + c + " se pojavljuje " + brPojavljivanja + " puta");

		s.close();

	}

	static int brKaraktera(String s, char c) {
		int brKaraktera = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				brKaraktera++;
			}
		}
		return brKaraktera;
	}
}
