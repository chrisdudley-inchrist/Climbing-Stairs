public class Main {


    public static void main(String[] args) {

        System.out.println("The possible solutions are: " + climbingStairs(7));
    }

    /**
     * You are climbing a stair case. It takes n steps to reach to the top.
     *
     * Each time you can either climb 1 or 2 steps. In how many distinct ways
     * can you climb to the top?
     *
     * Note: Given n will be a positive integer.
     * @param n = number of stairs
     * @return the number of solutions
     */

    private static int climbingStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}