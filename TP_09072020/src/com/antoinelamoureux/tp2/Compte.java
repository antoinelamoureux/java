package com.antoinelamoureux.tp2;

import java.util.Scanner;

public class Compte {
	protected double solde;
	private static int code = 0;

	{ 
		setCode(getCode() + 1);
	}

	public Compte() {
		super();
	}
	
	
	public Compte(double solde) {
		super();
		this.solde = solde;
	}


	private int getCode() {
		return code;
	}

	private void setCode(int code) {
		Compte.code = code;
		
	}

	public double getSolde() {
		return solde;
	}

	public double deposer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer un montant à déposer: ");
		return solde = solde + sc.nextDouble();
	}
	
	public double retirer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer un montant à retirer: ");
		return solde = solde - sc.nextDouble();
	}
}
