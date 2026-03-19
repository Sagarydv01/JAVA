public class ThrowsDemo {
    int div(int a, int b) throws ArithmeticException {
        int res= a/b;
        System.out.println("result: " + res);
        // throw new ArithmeticException("HHH");
        return 0;
    }
    public static void main(String[] args) {
        ThrowsDemo ob = new ThrowsDemo();
        // ob.div(23, 0);
        ob.div(221, 32);
    }
}
