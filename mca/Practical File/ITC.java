// 24. Write a program on inter-thread communication (wait(), notify()).

class Shared {
    int data;
    boolean available = false;

    synchronized void put(int v) {
        try {
            while (available) wait();
            data = v;
            System.out.println("Produced: " + v);
            available = true;
            notify();
        } catch (Exception e) {}
    }

    synchronized void get() {
        try {
            while (!available) wait();
            System.out.println("Consumed: " + data);
            available = false;
            notify();
        } catch (Exception e) {}
    }
}

public class ITC {
    public static void main(String[] args) {
        Shared s = new Shared();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) s.put(i);
        }).start();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) s.get();
        }).start();
    }
}