package multi.threading;

public class ThreadExample1Main {

	public static void main(String[] args) throws InterruptedException {

		long t = System.currentTimeMillis();
		System.out.println("Thread Start time:" + t);
		ThreadExample1 thread1 = new ThreadExample1(1);
		
		thread1.start();

		ThreadExample1 thread12 = new ThreadExample1(2);
		
		thread12.start();

		long t1 = System.currentTimeMillis();
		System.out.println("Thread end time:" + t1);

		System.out.println("Total Time taken for running 2 threads is" + (t - t1));
	}

}
