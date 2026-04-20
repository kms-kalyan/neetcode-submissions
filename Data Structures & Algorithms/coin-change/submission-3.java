class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n=coins.length;
        int[][] dp = new int[n][amount+1];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],-1);
        int ans = change(coins,amount,n-1,dp);

        if(ans >= (int)1e9)
            return -1;
        
        return ans;
    }

    public int change(int[] cns, int amt, int i, int[][] dp){
        if(i==0){
            if(amt%cns[0]==0){
                return amt/cns[0];
            }
            return (int)1e9;
        }
        if(dp[i][amt]!=-1)
            return dp[i][amt];
        
        int notTake = 0+change(cns,amt,i-1,dp);
        int take = (int)1e9;
        if(cns[i]<=amt)
            take = 1+change(cns,amt-cns[i],i,dp);
        
        return dp[i][amt] = Math.min(take,notTake);
    }
}
