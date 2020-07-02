package com.antoinelamoureux.tp6;
import java.util.Hashtable;


public class Application {

	public static void main(String[] args) {
		Salarie salarie1 = new Salarie(5945456, 1, 5, "Emilie", 1800);
		Salarie salarie2 = new Salarie(1285645, 1, 5, "Gérard", 1500);
		Salarie salarie3 = new Salarie(1458758, 1, 5, "Micheline", 2000);
		Salarie salarie4 = new Salarie(9815645, 1, 5, "Raymond", 2500);
		Salarie salarie5 = new Salarie(5835825, 1, 5, "Giselle", 3000);
		Commercial commercial1 = new Commercial(55802.5, 2, 8585852, 1, 5, "Pauline", 1800.);
		Commercial commercial2 = new Commercial(55802.5, 2, 5858588, 1, 5, "Clara", 1900);
		Commercial commercial3 = new Commercial(55802.5, 2, 2525725, 1, 5, "Monique", 2300);
		
		Hashtable<Integer, Salarie> salaries = new Hashtable<>();
		
		salaries.put(5945456, salarie1);
		salaries.put(1285645, salarie2);
		salaries.put(1458758, salarie3);
		salaries.put(9815645, salarie4);
		salaries.put(5835825, salarie5);
		salaries.put(8585852, commercial1);
		salaries.put(5858588, commercial2);
		salaries.put(2525725, commercial3);
		
		try { 
		salaries.forEach((k, v) -> System.out.println("Matricule : " + k + ", Nom : " + v.getM_strNom() + 
				" | Salaire : " + v.calculSalaire(v.getM_strNom(), v.getM_dSalaire())));
		} catch(Exception e) { 
            System.out.println("Exception: " + e); 
        } 
		
		System.out.println("Nombre d'instances crées : "+Salarie.getInstanceCount());
	}
}

