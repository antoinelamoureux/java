package com.antoinelamoureux.tp1;

public class CompteEpargne extends Compte {
	private int tauxInteret = 6;

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(double solde) {
		super(solde);
		// TODO Auto-generated constructor stub
	}
	
	public CompteEpargne(int tauxInteret) {
		super();
		this.tauxInteret = tauxInteret;
	}

	public int getTauxInteret() {
		return tauxInteret;
	}

	public double calculInteret() {
		solde = solde + (solde * tauxInteret /100);
		return solde;
	}

}
