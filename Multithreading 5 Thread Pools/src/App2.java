import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor1 implements Runnable {
	private int id;

	public Processor1(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Started for id: "+id);
		long start = System.currentTimeMillis();
		try {
		Thread.sleep(1000);
		}catch(Exception e) {
		}
		ArrayList<Integer>list1 = new ArrayList();
		for(int i=0; i<100; i++) {
			list1.add(i*i);
		}
		long stop = System.currentTimeMillis();
		System.out.println("Processing time for id: "+id+" is: "+(stop-start));
		System.out.println("Completed for id: "+id);
		System.out.println(list1);
	}
}

public class App2 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<6;i++ ) {
			executor.submit(new Processor1(i));

		}

		executor.shutdown();
		System.out.println("All tasks submitted");
		
		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {

		}
		
		System.out.println("All tasks completed");
	}
}
