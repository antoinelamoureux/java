import java.util.Scanner;

public class Employee3 {
	private String nom;
	private double salaireBrute, salaireNet, retenues, taux;
	
	public Employee3(String n, double sb) {
		this.nom = n;
		this.salaireBrute = sb;
	}
	
	public void affiche() {
		salaireNet = salaireNet(salaireBrute);
		System.out.println("Vous vous appelez"+nom+" et votre salaire net est"+salaireBrute);
	}
	
	public double salaireNet(double salaireBrute) {
		
		retenues = salaireBrute * 0.2;
		salaireNet = salaireBrute - retenues;
		
		return salaireNet;
	}
	
	public static void main(String[] args) {
		Employee3 em = new Employee3("Thierry", 4000);
		em.affiche();
		
		System.out.println("Votre salaire net est: "+em.salaireNet(5000));
	}
 
}
