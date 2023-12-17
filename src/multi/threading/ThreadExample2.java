package multi.threading;

import java.util.Random;

public class ThreadExample2 implements Runnable {

	private int threadNumber;

	/**
	 * @param threadNumber
	 */
	public ThreadExample2(int threadNumber) {
		this.threadNumber = threadNumber;
	}


	public void run() {

		try {
			countMe();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void countMe() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			
			Thread.sleep(random.nextInt(5000));// sleep the thread for 1000 msec
			System.out.println("Thread Number is " + threadNumber + " For Loop instance is " + i);

		}
	}
}
