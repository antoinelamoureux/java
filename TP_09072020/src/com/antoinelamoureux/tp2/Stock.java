package com.antoinelamoureux.tp2;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
	static Scanner sc;
	
	public Stock(ArrayList<Article> stock) {
		super();
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		ArrayList<Article>  stock = new ArrayList<>();
		stock.add(new Article(500,"laptop",1899,8));
		
		System.out.println("1. Afficher tous les articles.");
		System.out.println("2. Rechercher un article par référence.");
		System.out.println("3. Ajouter un article par référence.");
		System.out.println("4. Supprimer un article par référence.");
		System.out.println("5. Modifier un article par référence.");
		System.out.println("6. Rechercher un article par nom.");
		System.out.println("7. Rechercher un article par intervalle de prix de vente.");

		afficherstock(stock);
	}

	public static void afficherstock(ArrayList<Article> stock) {
		int choix = sc.nextInt();

		switch (choix) {
		case 1 : 
			afficherArticles(stock);
		case 2 : 
			rechercheArticle(stock);
		case 3 : 
			ajouterArticle(stock);
		case 4 : 
			supprimerArticle(stock);
		case 5 : 
			modifierArticle(stock);
		case 6 : 
			rechercherNom(stock);
		case 7 : 
			intervallePrix(stock);
		default : 
			afficherstock(stock);
		}

		while (true) {
			afficherstock(stock);
		}
	}

	public static void afficherArticles(ArrayList<Article> stock) {
		System.out.println("Tous les articles: ");
		stock.forEach(article -> System.out.println(article.toString()));
		System.out.print("\n");
		afficherstock(stock);
	}

	public static void rechercheArticle(ArrayList<Article> stock) {
		System.out.print("Rechercher un article par référence: ");
		int input = sc.nextInt();
		for (int i =0; i < stock.size(); i++) {
			if (stock.get(i).getReference() == input) {
				System.out.println(stock.get(i).toString());
			} else {
				System.out.print("Article non trouvé.");
				break;
			}
		}
		System.out.print("\n");
		afficherstock(stock);
	}

	public static void ajouterArticle(ArrayList<Article> stock) {
		System.out.println("Ajouter un article par référence: ");
		int input2 = sc.nextInt();
		for (int i =0; i < stock.size(); i++) {
			if (stock.get(i).getReference() != input2) {
				System.out.print("Indiquer le nom: ");
				String nom1 = sc.next();
				System.out.print("Indiquer le prix: ");
				double prix1 = sc.nextDouble();
				System.out.print("Indiquer la quantité: ");
				int quantite1 = sc.nextInt();
				stock.add(new Article(input2, nom1, prix1,quantite1));
				break;
			}
		}
		System.out.print("\n");
			afficherstock(stock);
	}

	public static void supprimerArticle(ArrayList<Article> stock) {
		System.out.println("Supprimer un article par référence: ");
		int input3 = sc.nextInt();
		for (int i =0; i < stock.size(); i++) {
			if (stock.get(i).getReference() == input3) {
				stock.remove(i);
				System.out.println("Article supprimé.");
			} else {
				System.out.print("Article non trouvé.");
				break;
			}
		}
		System.out.print("\n");
			afficherstock(stock);
	}

	public static void modifierArticle(ArrayList<Article> stock) {
		System.out.println("Modifier un article par référence: ");
		int input4 = sc.nextInt();
		for (int i =0; i < stock.size(); i++) {
			if (stock.get(i).getReference() == input4) {
				System.out.print("Indiquer le nom: ");
				String nom2 = sc.next();
				System.out.print("Indiquer le prix: ");
				double prix2 = sc.nextDouble();
				System.out.print("Indiquer la quantité: ");
				int quantite2 = sc.nextInt();
				stock.set(i, new Article(input4, nom2, prix2, quantite2));
				System.out.println("Article modifié.");
			} else {
				System.out.print("Article non trouvé.");
				break;
			}
		}
		System.out.print("\n");
			afficherstock(stock);
	}

	public static void rechercherNom(ArrayList<Article> stock) {
		System.out.println("Rechercher un article par nom: ");
		String input5 = sc.next();
		for (int i =0; i < stock.size(); i++) {
			if (stock.get(i).getNom().equals(input5)) {
				System.out.println(stock.get(i).toString());
			} else {
				System.out.print("Article non trouvé.");
				break;
			}
		}
		System.out.print("\n");
			afficherstock(stock);
	}

	public static void intervallePrix(ArrayList<Article> stock) {
		System.out.println("Rechercher un article par intervalle de prix de vente: ");
		System.out.print("Prix min: ");
		int input6 = sc.nextInt();
		System.out.print("Prix max: ");
		int input7 = sc.nextInt();
		for (int i =0; i < stock.size(); i++) {
			if ((stock.get(i).getPrix() > input6) && (stock.get(i).getPrix() < input7)) {
				System.out.println(stock.get(i).toString());
			} else {
				System.out.print("Article non trouvé.");
				break;
			}
		}
			System.out.print("\n");
			afficherstock(stock);
	}

}



