class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println("Hello, Sagar!");

        int a = 5, b = 0, c;

        try {
            c = a / b;
            System.out.println("c = " + c);
            System.out.println("Sagar!");
        } catch(ArithmeticException e){
            System.out.println(e); 
        } finally {
            System.out.println("Abnormal Execution!"); //  This line will always execute!
        }
        System.out.println("Radhe Radhe!"); //  This line will always execute!
    }
}
