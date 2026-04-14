// 22. Write a program to read and write data to a file. 

import java.io.*;
import java.util.Scanner;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {
            // Write data
            System.out.println("Enter text to write into file:");
            String data = sc.nextLine();

            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();

            System.out.println("Data written to file successfully.");

            // Read data
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            System.out.println("\nData read from file:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}