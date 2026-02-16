/*
3   4   7
7   5   12
12  6   18
18  7   25
25  8   33
33  9   42
*/

public class PrintPattern {
    public static void main(String[] args) {
        int n = 8, i, j;
        int a = 3, b = 4, k;

        for (i = 0; i <= 5; i++) {
            k = a + b;
            System.out.println(a + " " + b + " " + k);
            b++;
            a = k;
        }
    }
}
