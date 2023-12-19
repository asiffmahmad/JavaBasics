package multi.threading;

public class NonMultiThreadProgram {
	
	private int threadNumber;

	/**
	 * @param threaNumber
	 */
	public NonMultiThreadProgram(int threadNumber) {
		super();
		this.threadNumber = threadNumber;
	}
	public void countMe() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);//sleep the thread for 1000 msec
			System.out.println("Thread Number is "+threadNumber+" For Loop instance is "+i);
			
		}
	}
}
