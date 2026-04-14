// 10. Write a program to Multiply Two Matrix Using Multi-dimensional Arrays. 

import java.util.Scanner;

public class MatrixMultiplication {

    static int[][] readMatrix(Scanner sc, int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = sc.nextInt();
        return m;
    }

    static int[][] multiply(int[][] a, int[][] b, int r1, int c1, int c2) {
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns for first matrix: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and columns for second matrix: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Not possible");
            return;
        }

        System.out.println("Enter elements for first matrix:");
        int[][] a = readMatrix(sc, r1, c1);
        System.out.println("Enter elements for second matrix:");
        int[][] b = readMatrix(sc, r2, c2);

        System.out.println("Result of multiplication:");
        printMatrix(multiply(a, b, r1, c1, c2));

        sc.close();
    }
}