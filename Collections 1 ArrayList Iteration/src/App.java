import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class App {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(80);
		numbers.add(30);
		numbers.add(40);
		numbers.add(60);
		numbers.add(50);
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		numbers.remove(3);
		System.out.println("===============================");
		for(int i:numbers) {
			System.out.println(i);
		}
		
		Integer liczby[] = new Integer[numbers.size()];
		liczby = numbers.toArray(liczby);
		System.out.println(Arrays.toString(liczby));
	}
}
