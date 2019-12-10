import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);
		
		System.out.println(hashMap);
		System.out.println(linkedHashMap);
		System.out.println(treeMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(2, "rabbit");
		map.put(5, "snake");
		map.put(11, "catterpilar");
		map.put(-7, "giraffe");
		map.put(1, "rino");
		map.put(4, "bear");
		map.put(6, "butterfly");
		
		for(Integer key: map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
		System.out.println("------------------------------------------");
	}
}
