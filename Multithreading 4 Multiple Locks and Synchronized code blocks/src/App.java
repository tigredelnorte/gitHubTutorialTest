import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
	
	Random random = new Random();
	
	public List <Integer>list1 = new ArrayList();
	public List <Integer>list2 = new ArrayList();
	
	private Object obj1 = new Object();
	private Object obj2 = new Object();
	
	
	public void stageOne() {
		
		synchronized(obj1) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
		list1.add(random.nextInt(100));
		}
	}
	
	public void stageTwo() {
		
		synchronized(obj2) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
		list2.add(random.nextInt(100));
		}
	}
	
	public void process() {
		for(int i=0; i<1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
	
	public void main() {

		System.out.println("Starting...");
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
			
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
			
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken for calculation: "+ (end-start));
		System.out.println("List 1: "+ list1.size()+" List 2: "+list2.size());
	}
}
