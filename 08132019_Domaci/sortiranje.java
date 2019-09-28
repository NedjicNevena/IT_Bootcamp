import java.util.Arrays;
import java.util.Scanner;

public class sortiranje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Uneti broj elemenata niza:");
		int n = sc.nextInt();
		System.out.println("Uneti elemente:");
		int[] niz = new int[n];

		System.out.println("Unesite niz:");
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextInt();
        }

        int[] sortiranNiz = sortirajPoParnosti(niz);

        System.out.println("Sortiran po parnosti:");
        System.out.println(Arrays.toString(sortiranNiz));;

        sc.close();
    }

    static int[] sortirajPoParnosti(int[] a) {
        int dimenzija = a.length;
        int[] sortiranNiz = new int[dimenzija];
        int j = 0;

        for (int i = 0; i < dimenzija; i++) {
            if (a[i] % 2 == 0) {
                sortiranNiz[j] = a[i];
                j++;
            }
        }

        for (int i = 0; i < dimenzija; i++) {
            if (a[i] % 2 != 0) {
                sortiranNiz[j] = a[i];
                j++;
            }
        }

        return sortiranNiz;
    }
}
