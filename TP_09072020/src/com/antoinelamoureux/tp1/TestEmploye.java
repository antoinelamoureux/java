package com.antoinelamoureux.tp1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class TestEmploye {

	public static void main(String[] args) {
		Employe employe1 = new Employe();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.FRENCH);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Matricule: ");
		employe1.setMatricule(sc.nextInt());
		System.out.print("Nom: ");
		employe1.setNom(sc.next());
		System.out.print("Prenom: ");
		employe1.setPrenom(sc.next());
		System.out.print("Date de naissance (jj/mm/aaaa): ");
		employe1.setDatedenaissance(LocalDate.parse(sc.next(), formatter));
		System.out.print("Date d'embauche (jj/mm/aaaa): ");
		employe1.setDateembauche(LocalDate.parse(sc.next(), formatter));
		System.out.print("Salaire: ");
		employe1.setSalaire(sc.nextDouble());
		sc.close();
		
		employe1.afficherEmploye();
	}

}
