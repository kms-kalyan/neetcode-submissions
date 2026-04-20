class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int maxDiff = Integer.MIN_VALUE,ans=-1;
        int n = gas.length;
        for(int i=0;i<n;i++){
            if(gas[i]-cost[i]>=0){
                ans = i;
                int diff=0;
                for(int j=i;j<n;j++){
                    diff+=gas[j]-cost[j];
                    if(diff<0){
                        ans=-1;
                    }
                }
                for(int j=0;j<i;j++){
                    diff+=gas[j]-cost[j];
                    if(diff<0){
                        ans=-1;
                    }
                }
            }
            if(ans!=-1)
                break;
        }
    
        return ans;
    }
}
