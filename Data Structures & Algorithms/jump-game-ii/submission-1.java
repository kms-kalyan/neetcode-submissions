class Solution {
    public int jump(int[] nums) {
        int n = nums.length,jumps=0;
        int maxReached = 0,l=0,r=0;
        while(r<n){
            maxReached = 0;
            if(maxReached>=n-1)
                return jumps;
            for(int i=l;i<=r;i++)
                maxReached=Math.max(maxReached,i+nums[i]);
            l=r+1;
            r=maxReached;
            jumps++;
            if(r>=n-1)
                break;
            
        }

        return jumps;
    }
}
