// 23. Write a program to demonstrate thread life cycle.

class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " is running (State: RUNNABLE)");

        try {
            Thread.sleep(1000); // TIMED_WAITING
            System.out.println(getName() + " woke up from sleep");
        } 
        catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }

        System.out.println(getName() + " is exiting (State: TERMINATED)");
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        System.out.println(t1.getName() + " state before start: " + t1.getState()); // NEW

        t1.start(); // RUNNABLE

        try {
            t1.join(); // main waits
        } 
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println(t1.getName() + " state after completion: " + t1.getState()); // TERMINATED
    }
}