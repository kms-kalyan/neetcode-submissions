class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int maxDiff = Integer.MIN_VALUE,ans=-1,diff=0;
        int n = gas.length;
        for(int i=0;i<n;i++){
            if(gas[i]-cost[i]>=0){
                ans = i;
                int temp=0;
                for(int j=i;j<n;j++){
                    temp+=gas[j]-cost[j];
                    if(temp<0){
                        ans=-1;
                        break;
                    }
                }
                if(temp+diff>=0){
                    System.out.print(temp+", "+diff);
                    return ans;
                }
            }
            diff+=gas[i]-cost[i];
            ans = -1;
        }
    
        return ans;
    }
}
