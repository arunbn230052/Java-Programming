class NumberPrinter extends Thread {
    private String threadName;

    public NumberPrinter(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " prints: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " has finished.");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        NumberPrinter thread1 = new NumberPrinter("Thread-A");
        NumberPrinter thread2 = new NumberPrinter("Thread-B");

        thread1.start(); 
        thread2.start();

        System.out.println("Main thread is done launching threads.");
    }
}

