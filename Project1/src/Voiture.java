
public class Voiture {
	int vitesse;
	int temps;

	Voiture(int vitesse, int temps) {
		this.vitesse = vitesse;
		this.temps = temps;
	}

	public static void main(String[] args) {
		Voiture renault = new Voiture(80, 5);
		renault.afficheDistance();
		
		Voiture bmw = new Voiture(150, 8);
		bmw.afficheDistance();
		
	}
	
	public int calculDistance(int vitesse, int temps) {
		int distance = vitesse * temps;
		return distance;
	}
	
	public void afficheDistance() {
		int distance = calculDistance(vitesse, temps);
		System.out.println("La distance parcourue est de : "+distance+" mètres");
	}

}
