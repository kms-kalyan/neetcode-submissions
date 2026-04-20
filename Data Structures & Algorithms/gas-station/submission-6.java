class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int maxDiff = Integer.MIN_VALUE,ans=0,diff=0;
        int n = gas.length,shortage=0;
        for(int i=0;i<n;i++){
            diff+=gas[i];
            if(diff>=cost[i])
                diff -=cost[i];
            else{
                ans = i+1;
                shortage+=cost[i]-diff;
                diff=0;
            }
        }

        if(ans==n || diff<shortage)
            ans=-1;
    
        return ans;
    }
}
