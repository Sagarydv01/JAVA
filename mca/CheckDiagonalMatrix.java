// Check matrix is diagonal or not
public class CheckDiagonalMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        int flag = 0, i, j;

        for(i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (arr[i][j] == 0) {
                    flag = 1;
                    break;
                } else if (arr[i][j] != 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag != 0) 
            System.out.println("Its a Diagonal MAtrix");
        else
            System.out.println("Its NOT a diagonal Matrix!");
    }
}
