class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReached = 0;
        for(int i=0;i<n;i++){
            maxReached = Math.max(maxReached,i+nums[i]);
            if(maxReached>=n-1)
                return true;
            if(i==maxReached && nums[i]==0)
                return false;
        }

        return false;
    }
    public boolean jump(int i, int[] nums, int rem){

        if(i>=nums.length-1)
            return true;
        if(nums[i]==0)
            return false;
        // boolean j = jump(i+rem,nums, rem-1);
        boolean f = false;
        if(rem>=0){
            if(jump(i+1,nums,rem-1))
                return true;
        }
        if(i<nums.length)
            f = jump(i,nums,nums[i]);

        return f;
    }
}
