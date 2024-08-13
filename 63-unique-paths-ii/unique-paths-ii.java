class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        // Create a DP table
        int[][] dp = new int[m][n];
        
        // Initialize the DP table
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0; // No paths through obstacles
                } else if (i == 0 && j == 0) {
                    dp[i][j] = 1; // Starting cell
                } else {
                    int fromTop = (i > 0) ? dp[i - 1][j] : 0;
                    int fromLeft = (j > 0) ? dp[i][j - 1] : 0;
                    dp[i][j] = fromTop + fromLeft;
                }
            }
        }
        
        // The bottom-right cell contains the number of unique paths
        return dp[m - 1][n - 1];
    }

    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];

        // Initialize the base case for the top-left cell
        dp[0][0] = grid[0][0];

        // Initialize the first row
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Initialize the first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Fill the rest of the dp table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        // The bottom-right cell contains the minimum path sum
        return dp[n - 1][m - 1];
    }
}
