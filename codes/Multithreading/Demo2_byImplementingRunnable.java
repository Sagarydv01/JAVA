class A {
    void display(String str) {
        System.out.println(str);
    }
}
class Demo extends A implements Runnable {
    public void run() {
        System.out.println("run() thread!");
    }
}

public class Demo2_byImplementingRunnable {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Thread t = new Thread(demo);
        t.start();

        System.out.println("main() thread!");
    }
}
