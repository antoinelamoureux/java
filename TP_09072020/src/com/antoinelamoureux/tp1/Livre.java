package com.antoinelamoureux.tp1;

import java.util.Scanner;

public class Livre {
	private String titre;
	private String auteur;
	private double prix;
	private static int instanceCount = 0;

	{ 
		setInstanceCount(getInstanceCount() + 1);
	}

	public Livre() {
		super();
	}

	public Livre(String titre, String auteur, double prix) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}

	private void setInstanceCount(int instanceCount) {
		Livre.instanceCount = instanceCount;
	}


	private int getInstanceCount() {
		return instanceCount;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void affiche() {
		System.out.println("Livre "+getInstanceCount());
		Scanner sc = new Scanner(System.in);
		System.out.print("Donner le titre: ");
		String titre = sc.nextLine();
		System.out.print("Donner l'auteur: ");
		String auteur = sc.nextLine();
		System.out.print("Donner le prix: ");
		double prix = sc.nextDouble();
		
		System.out.println("Le titre est: "+titre);
		System.out.println("L'auteur est: "+auteur);
		System.out.println("Le prix est: "+prix+"€");
		System.out.println("Titre: "+titre+", Auteur: "+auteur+", Prix: "+prix+"€");
	}
}
