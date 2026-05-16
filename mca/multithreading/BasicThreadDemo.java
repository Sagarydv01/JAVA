// Method 1: Extending the Thread class

class BasicExtendingThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running " + Thread.currentThread().getName());
    }
}

// Method 2: Implementing Runnable interface
class BasicRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread running " + Thread.currentThread().getName());
    }
}

public class BasicThreadDemo {
    public static void main(String[] args) {

        // Threads using Thread class
        BasicExtendingThread thread1 = new BasicExtendingThread();
        BasicExtendingThread thread2 = new BasicExtendingThread();

        // Runnable objects
        BasicRunnableThread runnable1 = new BasicRunnableThread();
        BasicRunnableThread runnable2 = new BasicRunnableThread();

        // Creating Thread objects for Runnable
        Thread runnableThread1 = new Thread(runnable1);
        Thread runnableThread2 = new Thread(runnable2);
        Thread runnableThread3 = new Thread(new BasicRunnableThread()); // Directly creating a thread with a new Runnable instance


        // Starting threads
        thread1.start();
        thread2.start();

        runnableThread1.start();
        runnableThread2.start();
        runnableThread3.start();
    }
}