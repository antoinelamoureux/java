package com.antoinelamoureux.tp2;

public class Article {
private int reference; 
private String nom;
private double prix;
private int quantite;

public Article(int reference, String nom, double prix, int quantite) {
	super();
	this.reference = reference;
	this.nom = nom;
	this.prix = prix;
	this.quantite = quantite;
}


@Override
public String toString() {
	return "Article [reference=" + reference + ", nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + "]";
}

public int getReference() {
	return reference;
}

public void setReference(int reference) {
	this.reference = reference;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}


}
