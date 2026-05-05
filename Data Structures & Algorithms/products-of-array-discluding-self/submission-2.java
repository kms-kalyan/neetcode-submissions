class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1,zeros = 0;
        for(int i : nums){
            if(i==0)
                zeros++;
            else prod *= i;
        }
        
        int[] p = new int[nums.length];
        if(zeros>1)
            return p;
        for(int i=0;i<nums.length;i++){
            if(zeros == 1 && nums[i]!=0)
                p[i] = 0;
            else if(nums[i]==0)
                p[i] = prod;
            else p[i] = prod/nums[i];
        }

        return p;
    }
}  
