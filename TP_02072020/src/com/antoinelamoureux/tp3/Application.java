package com.antoinelamoureux.tp3;

public class Application {

	public static void main(String[] args) {
		Salarie salarie1 = new Salarie(5945456, 1, 5, "Emilie", 1800.50);
		
		System.out.println(salarie1.getM_nMatricule());
		System.out.println(salarie1.getM_nCategorie());
		System.out.println(salarie1.getM_nService());
		System.out.println(salarie1.getM_strNom());
		System.out.println(salarie1.getM_dSalaire());
		System.out.println("Nombre d'instances crées : "+Salarie.getInstanceCount());
	}

}