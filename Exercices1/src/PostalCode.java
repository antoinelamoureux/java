import java.util.Scanner;

public class PostalCode {
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un code postal : ");
		
        String postalCode = sc.nextLine();
        
        sc.close();
        
        if (postalCode.length() > 5) {
        	System.out.println("Ce code psotal est trop long.");
        } else if (postalCode.length() < 5) {
        	System.out.println("Ce code psotal est trop court..");
        } else if (postalCode.contains("[a-zA-Z]+")) {
        	System.out.println("Ce code psotal n'est pas valide.");
        } else {
        	System.out.println("Ce code psotal est valide.");
        }
    } 
}