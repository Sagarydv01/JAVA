// Method Level Synchronization Demo using two objects
class A extends Thread {
    public static synchronized void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 2; i++) {
            System.out.println(name + " : " + i);
        }
    }
}
class MethodLevelSynchronizationDemo2 {
    public static void main(String[] args) {
        A b1A = new A();
        A b2A = new A();
        A b3A = new A();

        b1A.setName("Thread 1");
        b2A.setName("Thread 2");
        b3A.setName("Thread 3");

        b1A.start();
        b2A.start();
        b3A.start();
    }
}
