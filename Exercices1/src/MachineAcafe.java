
public class MachineAcafe {
	private int nomCapsule;
	private int tailleCafe;
	private int quantiteDeau;

	public MachineAcafe(int nomCapsule2, int tailleCafe2, int qe) {
		this.nomCapsule = nomCapsule2;
		this.tailleCafe = tailleCafe2;
		this.quantiteDeau = qe;
	}

	public void typeCafe() {

		switch(nomCapsule) {
		case 1 : 
			System.out.println("Vous avez choisi le vert");
			break;
		case 2 :
			System.out.println("Vous avez choisi le vert");
			break;
		default :
			System.out.println("Mauvais choix");
		}
	}

	public void choixTailleCafe() {
		double eauRestanteC = quantiteDeau - 0.01;
		double eauRestanteL = quantiteDeau - 0.05;
		
		if (quantiteDeau==1) {
		switch(tailleCafe) {
		case 1 : 
			System.out.println("Vous avez choisi le café court");
			typeCafe();
			System.out.println("La quantité d'eau restante: "+eauRestanteC);
			break;
		case 2 :
			System.out.println("Vous avez choisi le café long");
			System.out.println("La quantité d'eau restante: "+eauRestanteL);
			typeCafe();
			break;
		default :
			System.out.println("Mauvais choix");
		}
	} else {
		System.out.println("Ajouter de l'eau");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
