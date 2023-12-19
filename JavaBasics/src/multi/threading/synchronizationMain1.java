package multi.threading;

import java.util.Iterator;

public class synchronizationMain1 {
	
	public static void main(String[] args) {
		
		synchronizationExample1 synchronizationExample = new synchronizationExample1();

	        Thread thread1 = new Thread(synchronizationExample);
	        Thread thread2 = new Thread(synchronizationExample);

	        thread1.start();
	        thread2.start();
		
		
		
	}
	
}
