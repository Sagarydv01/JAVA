class Demo implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("run() Thread!");
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("run() Thread interrupted");
        }
    }
}
class Demo_byImplementingRunnableClass {
    public static void main(String[] args) {
        Demo test = new Demo();
        Thread t = new Thread(test);
        t.start();
        for(int i = 0; i < 4; i++) {
            System.out.println("main() Thread!");
        }
    }
}
