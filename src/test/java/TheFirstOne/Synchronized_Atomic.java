package TheFirstOne;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
	
	//int count;
	
	// The Atomic way also provides Thread safety for you.
	// There are other combinations of it like AtomicBoolean etc.
	AtomicInteger count = new AtomicInteger();
	
	// synchronized means this method is called only by one thread.
	// if t1 called, t2 has to wait.
	// if t2 called, t1 has to wait.
	//public synchronized void increment() {
	
	// If you don't want to use synchronized then you can use Atomic way
	public void increment() {
		//count++;
		
		//Atomic way...
		count.incrementAndGet();
	}
}


public class Synchronized_Atomic {
	
	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
					for (int i = 1; i <= 1000; i++) {
						c.increment();
					}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
					for (int i = 1; i <= 1000; i++) {
						c.increment();
					}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count);
	}
}