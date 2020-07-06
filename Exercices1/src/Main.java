import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choisissez votre capsulte: \n 1= ==> vert \n 2= ==> jaune \n");
		int nomCapsule = sc.nextInt();
		
		System.out.println("Choisissez votre taille de café : \n 1= ==> long \n 2= ==> court \n");
		int tailleCafe = sc.nextInt();
		
		System.out.println("Avez-vous assez d'eau dans la machine : \n 1= ==> Oui \n 2= ==> Non \n");
		int reponse = sc.nextInt();
		
		MachineAcafe m1 = new MachineAcafe(nomCapsule, tailleCafe, reponse);
		
		m1.choixTailleCafe();
		
//		System.out.println("Saisissez le premier nombre");
//		double nbre1 = sc.nextDouble();
//		
//		System.out.println("Saisissez l'opérateur");
//		char operateur = sc.next().charAt(0);
//		
//		System.out.println("Saisissez l'opérateur");
//		double nbre2= sc.nextDouble();
//		
//		Calculatrice c1 = new Calculatrice(nbre1, operateur, nbre2);
//		c1.afficher();
		
//		double res = c1.addition(5, 6);
//		
//		System.out.println(res);
	}

}
