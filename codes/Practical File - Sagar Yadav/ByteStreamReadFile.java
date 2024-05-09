// 14. Write a program to use Byte stream class to read from a text file and display the content on the output screen. 

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamReadFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // Specify the path of the file to be read
            String filePath = "example.txt";
            
            // Create FileInputStream object to read the file
            fis = new FileInputStream(filePath);
            
            // Read bytes from the file and display the content on the output screen
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            // Handle any IO exception that may occur
            e.printStackTrace();
        } finally {
            try {
                // Close the FileInputStream object in the finally block
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}