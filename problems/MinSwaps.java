// LeetCode 1536: Minimum Swaps to Arrange a Binary Grid

class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;

        int[] endZeros = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    count++;
                } else {
                    break;
                }
            }
            endZeros[i] = count;
        }

        int swaps = 0;

        for (int i = 0; i < n; i++) {
            int requiredZeros = n - 1 - i;

            if (endZeros[i] >= requiredZeros) {
                continue;
            }

            int j = i + 1;
            while (j < n && endZeros[j] < requiredZeros) {
                j++;
            }

            if (j == n) {
                return -1;
            }

            while (j > i) {
                int temp = endZeros[j];
                endZeros[j] = endZeros[j - 1];
                endZeros[j - 1] = temp;
                j--;
                swaps++;
            }
        }

        return swaps;
    }
}

public class MinSwaps {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {
            {0, 0, 1},
            {1, 1, 0},
            {1, 0, 0}
        };
        int output = solution.minSwaps(grid);
        System.out.println("Minimum swaps: " + output);
    }
}