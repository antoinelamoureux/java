import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<Salarie> personnes = new ArrayList<Salarie>();

		personnes.add(new Salarie(5945456, 1, 5, "Emilie", 1800));
		personnes.add(new Salarie(5945112, 2, 2, "Robert", 1500));
		personnes.add(new Salarie(5945112, 2, 3, "Madelaine", 1900));
		personnes.add(new Salarie(5945112, 1, 2, "Camille", 2100));
		personnes.add(new Salarie(5945112, 2, 4, "Marcus", 5000));
		personnes.add(new Salarie(5945112, 1, 2, "Steve", 5800));

		List<Double> gains = personnes.stream()
				.map(p -> p.getM_dSalaire())
				.collect(Collectors.toList());
		System.out.println(gains);

		Stream<Salarie> resultat = personnes
				.stream()
				.filter(p -> p.getM_nCategorie() == 2);
		System.out.println("Salariés de la catégorie 2: ");
		resultat.forEach(p -> System.out.println(p));

		List<String> list = Arrays.asList("geeks", "gfg", "g", 
				"e", "e", "k", "s"); 

		List<String> answer = list.stream().map(String::toUpperCase). 
				collect(Collectors.toList()); 

		System.out.println(answer); 

	}

}
