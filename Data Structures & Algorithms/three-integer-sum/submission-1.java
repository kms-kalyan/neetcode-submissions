class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k=nums.length-1;
            int sum = 0;
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];

                if(sum == 0){
                    if(!list.contains(Arrays.asList(nums[i],nums[j],nums[k])))
                        list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                }else if(sum>0)
                    k--;
                else j++;
            }
        }

        return list;
    }
}
