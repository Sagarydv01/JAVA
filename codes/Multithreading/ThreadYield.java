class A extends Thread {
    public void run() {
        // for (int i = 0; i < 3; i++) {
            System.out.println("Thread 1");
            // System.out.println(Thread.currentThread().getName());
        // } 
        Thread.yield();
}
class B extends Thread {
    public void run() {
        // for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        // } 
        // Thread.yield();
    }
}
public class ThreadYield {
    public static void main(String[] args) {
        A t1a = new A();
        B t1b = new B();
        // A t2 = new A();
        // A t3 = new A();
        // t1.setName("t1");
        // t2.setName("t2");
        // t3.setName("t3");

    }
}
