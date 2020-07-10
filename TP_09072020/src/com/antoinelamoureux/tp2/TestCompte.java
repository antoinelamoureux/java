package com.antoinelamoureux.tp2;

public class TestCompte {

	public static void main(String[] args) {
		Compte compte1 = new Compte(5800);
		CompteEpargne compteEpargne1 = new CompteEpargne();
		ComptePayant comptePayant1 = new ComptePayant(2500);

		compte1.deposer();
		compteEpargne1.deposer();
		comptePayant1.deposer();
		
		compte1.retirer();
		compteEpargne1.retirer();
		comptePayant1.retirer();
		
		compteEpargne1.calculInteret();
		
		System.out.println("Solde du compte: "+compte1.solde);
		System.out.println("Solde du compte épargne: "+compteEpargne1.solde);
		System.out.println("Solde du compte payant: "+comptePayant1.solde);
	}
}
