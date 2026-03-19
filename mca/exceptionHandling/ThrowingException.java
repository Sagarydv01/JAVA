public class ThrowingException {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Success");
    }
}
