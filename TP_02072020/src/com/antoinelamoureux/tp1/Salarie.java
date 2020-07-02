package com.antoinelamoureux.tp1;

public class Salarie {
	int m_nMatricule;
	int m_nCategorie;
	int m_nService;
	String m_strNom;
	double m_dSalaire;
	
	public void calculSalaire(String nom, double salaire) {
		System.out.print("Le salaire de"+ nom + "est de" +salaire);
	}
}
