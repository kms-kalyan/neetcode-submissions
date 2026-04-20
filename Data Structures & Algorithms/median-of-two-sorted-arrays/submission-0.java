class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length, n2 = nums2.length;
        int[] nums = new int[n1+n2];
        int i=0,j=0,in=0;

        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                nums[in++] = nums1[i];
                i++;
            }else if(nums2[j]<nums1[i]){
                nums[in++] = nums2[j];
                j++;
            }else{
                nums[in++] = nums1[i];
                nums[in++] = nums2[j];
                i++;
                j++;
            }
        }

        while(i<n1){
            nums[in++] = nums1[i];
            i++;
        }

        while(j<n2){
            nums[in++] = nums2[j];
            j++;
        }

        if(nums.length % 2 ==0){
            //System.out.println(nums[(n1+n2)/2]+" "+nums[(n1+n2)/2 - 1]);
            return (double) (nums[(n1+n2)/2]+nums[(n1+n2)/2 - 1])/2;
        }
        
        return (double) nums[(n1+n2)/2];
    }
}
