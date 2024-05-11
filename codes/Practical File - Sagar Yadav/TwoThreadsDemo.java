// 20. Write a program creating 2 threads using Runnable interface. Print your name in ``run()`` method of first class and "Hello Java" in ``run()`` method of second thread.

class MyNamePrinter implements Runnable {
    public void run() {
        System.out.println("My name is Sagar Yadav.");
    }
}

class HelloJavaPrinter implements Runnable {
    public void run() {
        System.out.println("Hello Java");
    }
}

public class TwoThreadsDemo {
    public static void main(String[] args) {
        MyNamePrinter myNamePrinter = new MyNamePrinter();
        HelloJavaPrinter helloJavaPrinter = new HelloJavaPrinter();

        Thread thread1 = new Thread(myNamePrinter);
        Thread thread2 = new Thread(helloJavaPrinter);

        thread1.start();
        thread2.start();
    }
}
// Sagar Yadav, Enrollment No.: 02027902022, 4th Semester, BCA (2022-25)