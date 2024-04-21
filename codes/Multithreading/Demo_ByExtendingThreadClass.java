// package Multithreading;
// By extending Thread Class
class A extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("run() thread");
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("run() thread interrupted");
        }
    }
}
class Demo_ByExtendingThreadClass {
    public static void main(String[] args) {
        A demoThread = new A();
        demoThread.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main() thread");
            } 
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("main() thread interrupted");
        }
    }
}