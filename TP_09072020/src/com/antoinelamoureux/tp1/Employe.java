package com.antoinelamoureux.tp1;

import java.time.LocalDate;
import java.time.Period;

public class Employe {
private int matricule;
private String nom;
private String prenom;
private LocalDate datedenaissance;
private LocalDate  dateembauche;
private double salaire;

public Employe() {
	super();
}

public int getMatricule() {
	return matricule;
}

public void setMatricule(int matricule) {
	this.matricule = matricule;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public LocalDate getDatedenaissance() {
	return datedenaissance;
}

public void setDatedenaissance(LocalDate  datedenaissance) {
	this.datedenaissance = datedenaissance;
}

public LocalDate getDateembauche() {
	return dateembauche;
}

public void setDateembauche(LocalDate  dateembauche) {
	this.dateembauche = dateembauche;
}

public double getSalaire() {
	return salaire;
}

public void setSalaire(double salaire) {
	this.salaire = salaire;
}

public int age(LocalDate datedenaissance) {
	LocalDate today = LocalDate.now();                            
	Period p = Period.between(datedenaissance, today);
	
	return p.getYears();
}

public int anciennete(LocalDate dateembauche) {
	LocalDate today = LocalDate.now();                             
	 
	Period p = Period.between(dateembauche, today);
	
	return p.getYears();
}

public double augmentationDuSalaire(double s) {
	int a = anciennete(dateembauche);
	
	if (a < 5 ) {
		s = s + (s*2 /100);
	} else if (a < 10) {
		s = s + (s*5 /100);
	} else {
		s = s + (s*10 /100);
	}
	
	return s;
}

public void afficherEmploye() {
	System.out.println("Matricule: "+matricule);
	String c1 = prenom.substring(0,1).toUpperCase() + prenom.substring(1);
	System.out.println("Nom complet: "+nom.toUpperCase()+" "+c1);
	System.out.println("Age: "+age(datedenaissance)+" ans");
	System.out.println("Ancienneté: "+anciennete(dateembauche)+" ans");
	System.out.println("Salaire: "+salaire+"€");
	
	System.out.println("\n");
	System.out.println("Après application de l'augmentation de salaire: ");
	System.out.println("\n");
	
	System.out.println("Matricule: "+matricule);
	System.out.println("Nom complet: "+nom.toUpperCase()+" "+c1);
	System.out.println("Age: "+age(datedenaissance)+" ans");
	System.out.println("Ancienneté: "+anciennete(dateembauche)+" ans");
	System.out.println("Salaire: "+augmentationDuSalaire(salaire)+"€");
}

}
