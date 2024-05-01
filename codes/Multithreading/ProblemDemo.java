// Multithreading Problem
class A implements Runnable{
    int a = 1, p;
    A(int p) {
        this.p = p;
    }
    public void run() {
        String name = Thread.currentThread().getName();
        if (a == p) {
            System.out.println(name + " done.");
            a--;
        } else {
            System.out.println(name + " not done.");
        }
    }
}
class ProblemDemo {
    public static void main(String[] args) {
        A b = new A(1);
        Thread b1 = new Thread(b);
        Thread b2 = new Thread(b);
        b1.setName("Thread 1");
        b2.setName("Thread 2");
        b1.start();
        b2.start();
    }
}
