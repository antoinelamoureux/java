import java.util.Scanner;
public class AppSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faites votre choix!");

		int choix = sc.nextInt();

		switch(choix) {
		case 1 : 
			System.out.println("Vous avez fait le choix 1");
			break;
		case 2 :
			System.out.println("Vous avez fait le choix 2");
			break;
		case 3 :
			System.out.println("Vous avez fait le choix 3");
			break;
		default :
			System.out.println("Aucun choix");
		}

	}

}
