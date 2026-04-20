class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=2;i<=n;i++){
            int take = nums[i-1]+dp[i-2];
            int not = dp[i-1];
            dp[i] = Math.max(take,not);
        }
        //dp[n] = Math.max(dp[n-1],ndp[n-2]);
        return dp[n];
    }

    public int rob(int i, int[] nums){
        int n = nums.length;
        if(i<0)
            return 0;
        int take = nums[i]+rob(i-2,nums);
        int not = rob(i-1,nums);

        return Math.max(take,not);
    }
}
