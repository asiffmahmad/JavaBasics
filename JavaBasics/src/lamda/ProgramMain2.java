package lamda;

public class ProgramMain2 {
	public static void main(String[] args) {
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("asiff");
//				
//			}
//		});
		// the above code is replace by the below since runnable interface has only one abstract method
		Thread thread = new Thread(()->{System.out.println("inside the thread");});
		thread.start();
	}

}
