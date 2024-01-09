package multi.threading;

import java.util.Iterator;

public class synchronizationExample1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		genertae();
	}

	synchronized public void genertae() {
		
		
		for (int i = 0; i < 5; i++) {
			
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

}
