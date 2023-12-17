package multi.threading;

public class ThreadExample4 {
    public static int balance = 0;
    private static final Object lock = new Object();

    public static void deposit(int amount) {
        synchronized (lock) {
            balance = balance + amount;
            System.out.println("Balance Updated " + balance);
            lock.notifyAll(); // Notify all waiting threads that the balance has been updated
        }
    }

    public static void withdraw(int withdrawAmount) throws InterruptedException {
        synchronized (lock) {
            while (balance <= 0) {
                System.out.println("Balance not available. Please wait...!");
                lock.wait();
            }
            if (withdrawAmount > 0) {
                balance = balance - withdrawAmount;
                System.out.println("After withdrawAmount Balance is " + balance);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                withdraw(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.setName("Thread1");
        thread1.start();

        Thread thread2 = new Thread(() -> {
            try {
                deposit(256);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread2.setName("Thread2");
        thread2.start();
    }
}
