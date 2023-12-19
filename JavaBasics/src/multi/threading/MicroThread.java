package multi.threading;

import java.util.Random;

public class MicroThread {

	public static void main(String[] args) {
		threadExample();
	}

	public static void threadExample(){
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		        for (int i = 0; i < 10; i++) {
		            Random random = new Random();

		            try {
		                // Sleep the thread for a random duration between 0 and 5000 milliseconds
		                Thread.sleep(random.nextInt(5000));
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }

		            System.out.println("For Loop instance is " + i);
		        }
		    }
		}).start();

	}
}
