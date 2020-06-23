import java.util.Scanner;

public class Employee2 {
	public String nom;
	private double salaireBrut;
	private double salaireNet;
	private double retenues;
	private double taux;

	public Employee2(String n, double sb) {
		this.nom = n;
		this.salaireBrut = sb;
	}

	public static void main(String[] args) {
		System.out.println("Ecrire notre algorithme en JAVA");

		System.out.println("Saisissez un nom");
		Scanner sc = new Scanner(System.in); // on active le clavier
		String inputname = sc.nextLine();
		double inputsalary = sc.nextDouble();
		

		Employee2 em = new Employee2(inputname, inputsalary);
		double salaireNet = em.getNet();
		em.myFunction(salaireNet);
	}

	public double getNet() { 
		double retenues = salaireBrut * 0.2;
		double salaireNet = salaireBrut - retenues;
		return salaireNet;
	}

	public void myFunction(double salaireNet) {
		System.out.println("Vous avez saisie " + nom);
		System.out.println("Votre salaire brut est " + salaireBrut);
		System.out.println("Votre nom " + nom + " vous gagnez " + salaireBrut);
		System.out.println("Votre salaire net net est " + salaireNet);
		
	}

}