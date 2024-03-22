// package Multithreading;
// By extending Thread Class
class A extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ABC");
        }
    }
}
 class Demo_ByExtendingThreadClass {
    public static void main(String[] args) {
        A demoThread = new A();
        demoThread.start();
    }
 }