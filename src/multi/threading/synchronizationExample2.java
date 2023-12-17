package multi.threading;

import java.util.Iterator;

public class synchronizationExample2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			genertae();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void genertae() throws InterruptedException {

		final Object lock = "Lock";

		long start_time = System.currentTimeMillis();
		System.out.println(start_time);

		synchronized (lock) {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(123);

				for (int j = 0; j < 20; j++) {

					if (j < 10) {
						System.out.print("[");

					} else {
						System.out.print("]");
					}

				}
				System.out.println();

			}
		}
		System.out.println("synchronized");

		long end_time = System.currentTimeMillis();
		System.out.println(start_time - end_time);

	}

}
