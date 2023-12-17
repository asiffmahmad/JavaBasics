package multi.threading;

public class ThreadExample3 extends Thread {
	
	volatile public static int flag = 0;

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 0;
				while (flag == 0) {
					System.out.println(i + " Thread i is running");
					i++;
				}
				System.out.println("Thread exiting gracefully.");
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				flag = 1;
			}
		}).start();
	}
}
