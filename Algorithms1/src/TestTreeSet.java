import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("CCCCC");
		set.add("BBBBB");
		set.add("DDDDD");
		set.add("BBBBB");
		set.add("AAAAA");
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext() ) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.print("\n");
		
		Iterator<String> iterator2 = set.descendingIterator();
		while (iterator2.hasNext() ) {
			System.out.print(iterator2.next() + " ");
		}
	}

}
