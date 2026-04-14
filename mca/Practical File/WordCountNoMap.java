// 8. Write a program to count each word and total number of words in given string.
import java.util.Scanner;

public class WordCountNoMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");
        boolean[] visited = new boolean[words.length];

        System.out.println("Total words: " + words.length);

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(words[i] + " : " + count);
        }

        sc.close();
    }
}