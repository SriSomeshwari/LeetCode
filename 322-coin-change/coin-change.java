import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        // Initialize the dp table for the base case
        for (int j = 0; j <= amount; j++) {
            dp[0][j] = (j % coins[0] == 0) ? j / coins[0] : Integer.MAX_VALUE / 2;
        }

        // Fill the dp table for other cases
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                int take = Integer.MAX_VALUE / 2, not_take;
                not_take = dp[i - 1][j];
                if (coins[i] <= j) {
                    take = 1 + dp[i][j - coins[i]];
                }
                dp[i][j] = Math.min(take, not_take);
            }
        }

        int result = dp[n - 1][amount];
        return result == Integer.MAX_VALUE / 2 ? -1 : result;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();

        Solution solution = new Solution();
        int result = solution.coinChange(coins, amount);
        System.out.println(result);
    }
}
