import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try {
            // Call a method that propagates an exception
            methodA();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method A that propagates IOException to its caller
    public static void methodA() throws IOException {
        methodB();
    }

    // Method B that throws IOException
    public static void methodB() throws IOException {
        // Code that may throw an IOException
        throw new IOException("Something went wrong in methodB");
    }
}
