import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite string:");
		String str = s.nextLine().toLowerCase();

		boolean palindrom = palindrom(str);
		if (palindrom) {
			System.out.println(str + " je palindrom");
		} else {
			System.out.println(str + " nije palindrom");
		}
		s.close();
	}

	static boolean palindrom(String str) {
		String obrnutStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			obrnutStr += str.charAt(i);
		}
		if (str.equals(obrnutStr)) {
			return true;
		} else {
			return false;
		}
	}

}
