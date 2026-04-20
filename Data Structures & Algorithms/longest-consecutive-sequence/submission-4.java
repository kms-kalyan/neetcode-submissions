class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1)
            return nums.length;
        Arrays.sort(nums);
        int len=1,maxLen = 0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                continue;
            if(nums[i]+1==nums[i+1]){
                len++;
                maxLen = Math.max(maxLen,len);
            }else len = 1;
        }

        return Math.max(len,maxLen);
    }
}
