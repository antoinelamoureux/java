
public class Overload {

	public static void main(String[] args) {
		printValue(5);
		printValue(5, 8);
	}
	
	public static void printValue(int i) {
        System.out.println(" nombre entier = " + i);
    }
    
    public static void printValue(float f, int i) {
        System.out.println(" nombre entier = " + i +"\n nombre flottant = " + f);
    }

}
