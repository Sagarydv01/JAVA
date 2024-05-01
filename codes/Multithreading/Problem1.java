class A extends Thread {
    int num = 10;
    public void run() {
        num+=20;
        System.out.println("Class A num = " + num);
    }
}
public class Problem1 {
    public static void main(String[] args) {
        A tA = new A();
        // B tB = new B();
        tA.start();
        tA.num -=10;
        System.out.println(tA.num);

        // tB.start();
    }
}
