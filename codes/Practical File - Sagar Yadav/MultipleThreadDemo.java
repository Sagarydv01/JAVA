// 13. Write a program to demonstrate creation of multiple child threads. 

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class MultipleThreadDemo {
    public static void main(String[] args) {
        // Create and start multiple threads
        for (int i = 1; i <= 5; i++) {
            MyThread thread = new MyThread();
            thread.setName("Thread-" + i);
            thread.start();
        }
    }
} // Sagar Yadav, Enrollment No.: 02027902022, 4th Semester, BCA (2022-25)