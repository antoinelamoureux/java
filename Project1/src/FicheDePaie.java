/* Fiche de paie
 * 2020
 */


public class FicheDePaie {
	String nom;
	double salaireBrut;

	FicheDePaie(String n, double sb) {
		this.nom = n;
		this.salaireBrut = sb;
	}
	
	// Main
	
	public static void main(String[] args) {
		FicheDePaie fp = new FicheDePaie("Anouchka", 2500);
		fp.afficher();
		
		FicheDePaie fp2 = new FicheDePaie("Antoine", 1800);
		fp2.afficher();
	}
	
	// Calcul du salaire Net
	
	public double calculSalaireNet(double salaireBrut) {
		double retenues = salaireBrut * 0.2;
		double salaireNet = salaireBrut - retenues;
		return salaireNet;
	}
	
	// Affichage du résultat
	
	public void afficher() {
		double salaireNet = calculSalaireNet(salaireBrut);
		System.out.println("Votre nom est "+nom);
		System.out.println("Votre salaire net est :"+salaireNet);
	}

}
