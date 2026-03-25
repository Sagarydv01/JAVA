// package fileHandling;

import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        String str = "Radhey Radhey, Namaskar, kya kar rhe, Shivam bhai!";

        FileWriter fw = new FileWriter("file1.txt");
        try {
            for(int i = 0; i < str.length(); i++)
                fw.write(str.charAt(i));
            System.out.println("\n\tGood bYe!Kaam ho gya");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fw.close();
        }
    }
}
