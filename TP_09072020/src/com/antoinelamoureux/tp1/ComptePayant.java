package com.antoinelamoureux.tp1;

import java.util.Scanner;

public class ComptePayant extends Compte {

	public ComptePayant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComptePayant(double solde) {
		super(solde);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double deposer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer un montant à déposer: ");
		return solde = solde + sc.nextDouble() + 5;
	}
	
	@Override
	public double retirer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer un montant à retirer: ");
		return solde = solde - sc.nextDouble() + 5;
	}

}