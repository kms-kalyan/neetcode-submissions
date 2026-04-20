class Solution {
    public int maxProduct(int[] nums) {
        
        int pref = 1,suff=1,max=Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(pref==0)
                pref=1;
            if(suff==0)
                suff=1;
            pref *= nums[i];
            suff *= nums[n-i-1];
            max = Math.max(max,Math.max(pref,suff));
        }

        return max;

    }
}
