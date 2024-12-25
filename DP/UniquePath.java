package DP;

import java.util.Arrays;

public class UniquePath {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (i == 1) {
                    dp[i][j] = 1;
                } else if (j == 1) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[m][n];
    }


    public static void main(String[] args) {
        UniquePath solution = new UniquePath();
        int m1 = 3;
        int n1 = 7;
        System.out.println(solution.uniquePaths(m1, n1));
        int m2 = 3;
        int n2 = 2;
        System.out.println(solution.uniquePaths(m2, n2));
    }
}
