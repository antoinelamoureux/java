import java.util.Map; 
import java.util.TreeMap; 

public class TreeMap1 {

	public static void main(String[] arg) { 
        TreeMap<String, String> myMap = new TreeMap<String, String>();
        
        myMap.put("Renault", "21");
        myMap.put("BMW", "M8");
        myMap.put("Mercedes", "C63");
        myMap.put("Peugeot", "608");
        myMap.put("Ford", "Mustang");
        
        for (Map.Entry<String, String> entry: myMap.entrySet()) {
        	System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    } 
}
