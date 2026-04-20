class Solution {
    public int climbStairs(int n) {
        return climb(n);
    }

    public int climb(int n){

        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        // if(i<0)
        //     return 0;
        // int one = climb(i-1);
        // int two = climb(i-2);
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
