// 11. Write a program to demonstrate checked exception during file handling.

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file = new File("SagarYadav.txt");
        try {
            FileReader fr = new FileReader(file);
            char[] content = new char[(int) file.length()];
            fr.read(content);
            System.out.println("File content:\n" + new String(content));
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
} // Sagar Yadav, Enrolment No.: 02027902022, 4th Semester, BCA (2022-25)