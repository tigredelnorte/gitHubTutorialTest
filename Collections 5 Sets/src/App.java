import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		
		Set<String>set1 = new LinkedHashSet<String>();
		
		set1.add("dog");
		set1.add("cat");
		set1.add("cow");
		set1.add("bee");
		set1.add("ant");
		set1.add("elefant");
		set1.add("stonoga");
		
		System.out.println(set1.contains("krokodyl"));
		
		set1.add("bee");
		
		System.out.println(set1);
		
		String[]array = (String[]) set1.toArray();
		
		System.out.println(Arrays.deepToString(array));
	}
}
