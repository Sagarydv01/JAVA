// 18. Write a program to make use of BufferedStream to read lines from the keyboard until 'STOP' is typed.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedStreamExample {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        try {
            System.out.println("Enter lines (type 'STOP' to quit):");
            while (!(line = br.readLine()).equals("STOP")) {
                System.out.println("You entered: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
