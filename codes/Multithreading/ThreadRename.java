class A extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 0; i < 2; i++) {
            System.out.println(name + " : " + i);
        }
    }
}
class ThreadRename {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        System.out.println("t1 Thread");
        t1.start();
        System.out.println("t2 Thread");
        t2.start();
        System.out.println("t3 Thread");
        t3.start();
    }    
}
