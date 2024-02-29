class StaticMethodDemo {
    static int a = 10;

    static void print() {
        int b = 100;
        System.out.println("a = " + a + " b = " + b);
    }

    static void print(StaticMethodDemo ref) {
        int b = 100;
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        StaticMethodDemo obj1 = new StaticMethodDemo();
        obj1.print();
        StaticMethodDemo.a = 50;
        print();

        print(obj1);
    }
}
