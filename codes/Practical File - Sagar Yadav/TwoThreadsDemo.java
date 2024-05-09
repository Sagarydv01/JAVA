// 20. Write a program creating 2 threads using Runnable interface. Print your name in ``run()`` method of first class and "Hello Java" in ``run()`` method of second thread.

class MyNamePrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("My name is Sagar Yadav.");
    }
}

class HelloJavaPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello Java");
    }
}

public class TwoThreadsDemo {
    public static void main(String[] args) {
        // Create instances of the two classes implementing Runnable interface
        MyNamePrinter myNamePrinter = new MyNamePrinter();
        HelloJavaPrinter helloJavaPrinter = new HelloJavaPrinter();

        // Create threads using the Runnable instances
        Thread thread1 = new Thread(myNamePrinter);
        Thread thread2 = new Thread(helloJavaPrinter);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
