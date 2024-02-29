class CopyConstructorDemo {
    int num1, num2, num3; 

    public CopyConstructorDemo() {
        num1 = 10;
        num2 = 20;
        System.out.println("Value of num1: " + num1);
        System.out.println("Value of num2: " + num2);
    }

    public CopyConstructorDemo(CopyConstructorDemo ref) {
        num1 = ref.num1;
        num2 = ref.num2;
        num3 = 30; 
        System.out.println("Value of num1: " + num1);
        System.out.println("Value of num2: " + num2);
        System.out.println("Value of num3: " + num3);
    }

    public static void main(String[] args) {
        CopyConstructorDemo obj1 = new CopyConstructorDemo();

        System.out.println("Copied values:---");

        CopyConstructorDemo obj2 = new CopyConstructorDemo(obj1);
    }
}
