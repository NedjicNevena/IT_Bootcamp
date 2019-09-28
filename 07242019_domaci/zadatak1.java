import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		
		int dan;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dan");
		dan = sc.nextInt();
		sc.close();
		
		switch(dan){
		case 1:System.out.println("Ponedeljak - 5 dana do vineknda");break;
		case 2:System.out.println("Utorak - 4 dana do vikenda");break;
		case 3:System.out.println("Sreda - 3 dana do vikenda");break;
		case 4:System.out.println("Cetvrtak - 2 dana do vikenda");break;
		case 5:System.out.println("Petak - 1 dan do vikenda");break;
		case 6:System.out.println("Subota - vikend jeee!");break;
		case 7:System.out.println("Nedelja - vikend jeee!");break;
		}
		}
	}


