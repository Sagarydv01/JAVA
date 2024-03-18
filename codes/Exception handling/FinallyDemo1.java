class FinallyDemo1 {
    public static void main(String[] args) {
        System.out.println("Hello, Sagar!");
        int a = 5, b = 0, c;
        try {
            c = a / b;
            System.out.println("c = " + c);
        } catch(NullPointerException e){
            System.out.println(e); 
            System.out.println("Caught NullPointerException");
        } finally {
            System.out.println("Abnormal Execution!"); //  This line will always execute whether an exception is thrown
        }
        System.out.println("Radhe Radhe!"); // Would not be executed if an exception occurs in the above code
    }
}
