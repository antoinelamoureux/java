import java.util.Scanner;

public class Equation {
	static int d = 0;
	
	static void printEquation(int a,int b, int c) {
	     
	    System.out.println("les trois coefficients sont : a= "+a+" b= "+b+" c= "+c);
	    System.out.println("L`equation est : "+a+"*x*x+"+b+"*x+"+"*"+c);
	     
	}
	
	static void delta(int a, int b , int c) {
		d= (b*b) - 4*a*c;
	    System.out.println("la valeur de delta est "+d);  
	    
	    if (d<0) {
	    	System.out.println("L'équation n'a pas de solution.");  
	    } else if (d == 0) {
	    	System.out.println("L'équation a une unique solution."); 
	    } else {
	    	System.out.println("L'équation a 2 solutions distinctes."); 
	    }
	}
	
	static void power1(int a , int b , int d ) {
	    double x1;
	    x1 = (-b-(Math.sqrt(d)))/(2*a);
	    System.out.println("la premiere racine est"+x1);   
	     
	}
	static void power2(int a , int b , int d ) {
	    double x2;
	    x2 = (-b+Math.sqrt(d))/(2*a);
	    System.out.println("la deuxieme racine est"+x2);
	     
	}
	
	public static void main(String[]args) {
	     
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Coefficients ?");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    printEquation(a,b,c);
	    delta(a,b,c);
	    if (d > 0) {
	        power1(a,b,d);
	        power2(a,b,d);
	    }
	    else System.out.println("Erreur le discriminant est negatif "); 
	}
}
