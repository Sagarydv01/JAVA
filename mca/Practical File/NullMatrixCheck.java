// 7. Write a program to check given matrix is null matrix.

import java.util.Scanner;

public class NullMatrixCheck {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of rows: ");
                int rows = sc.nextInt();
                System.out.print("Enter number of columns: ");
                int cols = sc.nextInt();
                int[][] matrix = new int[rows][cols];

                System.out.println("Enter elements of the matrix:");
                for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                                matrix[i][j] = sc.nextInt();
                        }
                }

                boolean isNull = true;
                for (int i = 0; i < rows && isNull; i++) {
                        for (int j = 0; j < cols; j++) {
                                if (matrix[i][j] != 0) {
                                        isNull = false;
                                        break;
                                }
                        }
                }
                if (isNull) {
                        System.out.println("The matrix is a Null matrix.");
                } else {
                        System.out.println("The matrix is not a Null matrix.");
                }
                sc.close();
        }
}
