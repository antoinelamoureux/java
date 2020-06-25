import java.util.Scanner;

public class AppSwitch2 {

	public void methodeChoix() {
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
	
	public static void main(String[] args) {
//		AppSwitch2 app1 = new AppSwitch2(); 
//		app1.methodeChoix();
		
		
		for (int i=0; i<15; i++) {
			int passagesRestants = 15 - i;
			System.out.println("Vous etes à votre " +i+ "ème passage, il vous reste donc" +passagesRestants);
		}
	}
}
