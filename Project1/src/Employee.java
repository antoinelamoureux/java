import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		//
		/*
		 *
		 *
		 */
		System.out.println("Ecrire notre algorithme en JAVA");

		System.out.println("Saisissez un nom");
		Scanner sc = new Scanner(System.in); //on active le clavier
		String nom = sc.nextLine();
		double salaireBrut = sc.nextDouble();

		System.out.println("Vous avez saisie "+nom);
		System.out.println("Votre salaire brut est "+salaireBrut);

		double retenues = salaireBrut*0.2;
		double salaireNet = salaireBrut - retenues;

		System.out.println("Votre nom "+nom+" vous gagnez "+salaireBrut);

		System.out.println("Votre salaire net net est "+salaireNet);
	}

}
