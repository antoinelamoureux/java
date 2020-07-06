package com.antoinelamoureux.tp2;

public class Application {

	public static void main(String[] args) {
		Salarie salarie1 = new Salarie();
		
		salarie1.setM_nMatricule(5945456);
		salarie1.setM_nCategorie(1);
		salarie1.setM_nService(5);
		salarie1.setM_strNom("Emilie");
		salarie1.setM_dSalaire(1800.50);
		
		System.out.println(salarie1.getM_nMatricule());
		System.out.println(salarie1.getM_nCategorie());
		System.out.println(salarie1.getM_nService());
		System.out.println(salarie1.getM_strNom());
		System.out.println(salarie1.getM_dSalaire());
	}

}
