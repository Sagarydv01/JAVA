// Method level Synchronization using a single object
class A {
    public synchronized void A1(int a) {
        for (int i = 0; i < 3; i++) {
            System.out.println(a * i);
        }
    }
}
class B extends Thread {
    A a1;
    B (A a1) {
        this.a1 = a1;
    }
    public void run() {
        a1.A1(10);
    }
}
class C extends Thread {
    A a1;
    C (A a1) {
        this.a1 = a1;
    }
    public void run() {
        a1.A1(20);
    }
}
class MethodLevelSynchronizationDemo {
    public static void main(String[] args) {
        A obj1A = new A();
        B obj1B = new B(obj1A);
        C obj1C = new C(obj1A);
        obj1B.start();
        obj1C.start();
    }
}
