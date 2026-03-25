// package fileHandling;
import java.io.*;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        FileReader source = null;
        try {
            source = new FileReader("file1.txt");
            int temp;
            while ((temp = source.read()) != -1)
                System.out.print((char) temp);
            System.out.println("\n\t\tProgram Executed!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            source.close();
        }
    }
}
