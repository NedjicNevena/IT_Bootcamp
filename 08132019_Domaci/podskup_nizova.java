import java.util.Arrays;
import java.util.Scanner;

public class podskup_nizova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		boolean podskup;

		System.out.println("Unesite broj elemenata niza A:");
		n = sc.nextInt();

		int[] A = new int[n];

		System.out.println("Unesite niz A:");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		System.out.println("Unesite broj elemenata niza B:");
		n = sc.nextInt();

		int[] B = new int[n];

		System.out.println("Unesite niz B:");
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}

		podskup = podskup(A, B);
		System.out.println(podskup);

		if (podskup) {
			System.out.println("Niz A jeste podskup niza B.");
		} else {
			System.out.println("Niz A nije podskup niza B.");
		}

		sc.close();
	}

	static boolean podskup(int[] A, int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] <= B[j]) {
					if (A[i] != B[j]) {
						return false;
					} else {
						break;
					}
				}
			}
		}

		return true;
	}

}
