public class StackTraceDemo {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            StackTraceElement[] elements = e.getStackTrace();

            for (StackTraceElement i : elements) {
                System.out.println("Class: " + i.getClassName());
                System.out.println("Method " + i.getMethodName());
                System.out.println("Line Number: " + i.getLineNumber());
            }
        }
    }
}
