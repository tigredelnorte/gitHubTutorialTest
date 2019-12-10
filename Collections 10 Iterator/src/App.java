import java.util.Iterator;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		
		LinkedList<String>animals = new LinkedList();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("cow");
		animals.add("bee");
		animals.add("fox");
		
		Iterator<String> it = animals.iterator();
		System.out.println(animals);
		System.out.println("========================");
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			if(value.equals("cat")) {
				it.remove();
			}

		}
		System.out.println("========================");
		System.out.println(animals);
	}

}
