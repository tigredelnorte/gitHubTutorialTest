import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		HashMap <Integer, String>map = new HashMap<>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		
		System.out.println(map);

		for(Map.Entry<Integer,String>entry: map.entrySet()) {
			System.out.println("Key: "+ entry.getKey()+" value "+entry.getValue());
		}
		System.out.println("-------------------------------");
		
		for(Integer key: map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
	}
}
