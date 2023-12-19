package multi.threading;

public class MainFOrNonMultiThreadProgram {
	
	public static void main(String[] args) throws InterruptedException {
		NonMultiThreadProgram thread1 = new NonMultiThreadProgram(1);
		thread1.countMe();
		
		NonMultiThreadProgram thread12 = new NonMultiThreadProgram(2);
		thread12.countMe();
	}

}
