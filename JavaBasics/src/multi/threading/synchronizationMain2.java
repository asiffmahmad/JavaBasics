package multi.threading;

import java.util.Iterator;
//synchronized block
//synchronized clock
public class synchronizationMain2 {
	
	public static void main(String[] args) {
		
		synchronizationExample2 synchronizationExample = new synchronizationExample2();

	        Thread thread1 = new Thread(synchronizationExample);
	        Thread thread2 = new Thread(synchronizationExample);

	        thread1.start();
	        thread2.start();
		
		
		
	}
	
}
