package multi.threading;

public class ThreadExample1 extends Thread {

	private int threadNumber;

	@Override
	public void run() {
		try {
			countMe();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	/**
	 * @param threaNumber
	 */
	public ThreadExample1(int threadNumber) {
		super();
		this.threadNumber = threadNumber;
	}

	public void countMe() throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);// sleep the thread for 1000 msec
			System.out.println("Thread Number is " + threadNumber + " For Loop instance is " + i);

		}
	}

}
