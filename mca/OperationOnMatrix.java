public class OperationOnMatrix {

    // Addition
    static int[][] add(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];

        return result;
    }

    // Multiplication
    static int[][] multiply(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = b.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += a[i][k] * b[k][j];

        return result;
    }

    // Transpose
    static int[][] transpose(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] t = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                t[j][i] = a[i][j];

        return t;
    }

    // Print
    static void print(int[][] a) {
        for (int[] row : a) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        System.out.println("Addition:");
        print(add(matrix1, matrix2));

        System.out.println("\nMultiplication:");
        print(multiply(matrix1, matrix2));

        System.out.println("\nTranspose:");
        print(transpose(matrix1));
    }
}
