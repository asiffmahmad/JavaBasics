package multi.threading;

public class ThreadExample2Main {
	
	public static void main(String[] args) {
		
		ThreadExample2 thread1 = new ThreadExample2(1);
		ThreadExample2 thread2 = new ThreadExample2(2);
		ThreadExample2 thread3 = new ThreadExample2(3);
		
		// Create Thread objects and pass the instances of ThreadExample2 to them
				Thread t1 = new Thread(thread1);
				Thread t2 = new Thread(thread2);
				Thread t3 = new Thread(thread3);

				// Start the threads
				t1.start();
				t2.start();
				t3.start();
	}

}
