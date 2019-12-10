import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
//Sets do not compare using Collections.sor(). Only List do!!!!
		Set<String>animals = new TreeSet();
		animals.add("giraffe");
		animals.add("bear");
		animals.add("ant");
		animals.add("crocodile");
		animals.add("worm");
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		System.out.println("====================================");

		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
	}

}
