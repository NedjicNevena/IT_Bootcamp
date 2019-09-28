import java.util.Arrays;
import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza: ");
		int n = s.nextInt();
		int[] niz = new int[n];
		System.out.println("Unesite " + n + " elemenata niza:");
		for(int i = 0; i < n; i++){
			niz[i] = s.nextInt();
		}
			if(duplikati(niz)){
				System.out.println("U unetom nizu postoje duplikati.");
			} else {
				System.out.println("U unetom nizu ne postoje duplikati.");
			}
		s.close();
	}

		static boolean duplikati(int[] niz){
			Arrays.sort(niz);

			for(int i = 0, j = 1; j <niz.length; j++, i++){
				if(niz[i] == niz[j]){
					return true;
				}
			}
			return false;
		}

}
