// 25. Write a program on thread synchronization

class Counter {
    int count = 0;

    synchronized void inc() {
        System.out.println(Thread.currentThread().getName() + " -> " + (++count));
    }
}

public class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) c.inc();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) c.inc();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final: " + c.count);
    }
}