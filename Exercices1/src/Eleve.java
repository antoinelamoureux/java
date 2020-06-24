import java.util.HashMap;
import java.util.Scanner;

public class Eleve {
	String name;
	String firstName;
	HashMap<String, Double> notes;


	Eleve(String name, String firstName, HashMap<String, Double> notes) {
		this.name = name;
		this.firstName = firstName;
		this.notes = notes;

	}

	public static void main(String[] args) { 
		isAuthentified();

	}

	public static void isAuthentified() {
		Authentification user = new Authentification("antoine", "2020");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter votre nom d'utlisateur :");
		String userName = sc.nextLine();
		System.out.println("Enter votre mot de passe :");
		String userPassword = sc.nextLine();

		if (user.USER_NAME.contains(userName) && user.PASSWORD.contains(userPassword)) {
			System.out.println("Authentification réussie.");
			getNotes();	
		} else {
			System.out.println("Il ya une erreur dans vos identifiants.");
		}

	}

	public static void getNotes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter le nom :");
		String eleveName = sc.nextLine();
		System.out.println("Enter le prénom :");
		String eleveFirstName = sc.nextLine();

		String[] classes = {"Maths","Physique", "Français", "Anglais", "Histoire", "Sport"};	
		HashMap<String, Double> notes = new HashMap<String, Double>();


		for (int i = 0; i < classes.length; i++) { 
			System.out.println("Entrer la note en "+classes[i]);
			double note = sc.nextInt();
			notes.put(classes[i], note);
		}

		Eleve eleve = new Eleve(eleveName, eleveFirstName, notes);

		for (String i : eleve.notes.keySet()) {
			System.out.println("L'élève "+eleve.name+" "+eleve.firstName+" a obtenue la note "+eleve.notes.get(i)+" en "+i);
		}

		sc.close();
	}

}
