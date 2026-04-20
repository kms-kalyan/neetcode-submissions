class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=0,maxSum=(int)-1e9;
        int i=0,n=nums.length;
        if(n==1)
            return nums[0];
        while(i<n){
            sum+=nums[i];
            if(sum>maxSum)
                maxSum=sum;
            if(sum<0){
                sum=0;
            }
            i++;
            
        }
        return maxSum;
    }
}
