import java.util.Scanner;

public class Calculatrice {
	private  double n1, n2;
	private char op;
	
	public Calculatrice(double nbre1, char operateur, double nbre2) {
		this.n1 = nbre1;
		this.op = operateur;
		this.n2 = nbre2;
	}

	public double addition(double nombre1, double nombre2) {
		double resultat = nombre1 + nombre2;
		return resultat;
	}
	
	public double soustraction(double nombre1, double nombre2) {
		double resultat = nombre1 - nombre2;
		return resultat;
	}
	
	public double multiplication(double nombre1, double nombre2) {
		double resultat = nombre1 * nombre2;
		return resultat;
	}
	
	public double division(double nombre1, double nombre2) {
		double resultat = nombre1 / nombre2;
		return resultat;
	}
	
	public void afficher() {
		switch(op) {
		case '+' :
			double addit = addition(n1, n2);
			System.out.println("L'addition de"+n1+" et "+n2+" est égale à"+addit);
			break;
		case '-' :
			double sous = soustraction(n1, n2);
			System.out.println("La soustraction de"+n1+" et "+n2+" est égale à"+sous);
			break;
		default :

			System.out.println("Mauvais choix");
		}
	}
	
	public static void main(String[] args) {
		
	}
}
