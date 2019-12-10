import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	private static void doTimings(String type, List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		long end = System.currentTimeMillis();
	
		System.out.println("Time taken: "+(end-start)+" ms for "+type);
		
		long start0 = System.currentTimeMillis();
		for(int i=0; i<1E5; i++) {
			list.add(list.size()-100,i);
		}
		
		long end0 = System.currentTimeMillis();
	
		System.out.println("Time taken: "+(end0-start0)+" ms for "+type);
	
	}
}
