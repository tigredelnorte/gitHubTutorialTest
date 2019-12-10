import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {

		Queue<String> q1 = new ArrayBlockingQueue<String>(3);

		q1.add("One");
		q1.add("Two");
		q1.add("Three");
		try {
			q1.add("Four");
		} catch (Exception e) {
			System.out.println("TO many items in the queue.");
		}
		for(String q:q1) {
			System.out.println(q);
		}
		System.out.println("===========");
		q1.remove();
		for(String q:q1) {
			System.out.println(q);
		}
		System.out.println("==============");
		System.out.println("Q1 offer One "+q1.offer("One"));
		for(String q:q1) {
			System.out.println(q);
		}
		System.out.println("==============");
		System.out.println("Q1 offer Two "+q1.offer("Two"));
		for(String q:q1) {
			System.out.println(q);
		}
	}

}
