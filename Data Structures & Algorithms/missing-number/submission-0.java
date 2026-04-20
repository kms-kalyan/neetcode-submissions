class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,j=0;
        int n = nums.length;

        int act = ((n+1)*n)/2;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        return act-sum;
    }
}
