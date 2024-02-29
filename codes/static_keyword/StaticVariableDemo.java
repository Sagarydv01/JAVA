
class StaticVariableDemo {
    static int a;
    int b = 20;

    void print() {
        System.out.println("a = " + a + " b = " + b);
    }
    
    public static void main(String[] args) {
        StaticVariableDemo.a = 10;

        StaticVariableDemo obj1 = new StaticVariableDemo();
        StaticVariableDemo obj2 = new StaticVariableDemo();
        obj1.print();
        StaticVariableDemo.a = 40;
        obj1.print();
        obj2.print();
    }
}
