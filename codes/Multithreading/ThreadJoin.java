class  A extends Thread {
    public void run() {
        try { // System.out.println("Sagar!");
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName());
            } Thread.sleep(1000);
        } catch (InterruptedException e ) {
            System.out.println(e);
        }
    }
}
public class ThreadJoin {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t1.start();
        t2.start();
        try {
            // t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t3.start();
    }
}
