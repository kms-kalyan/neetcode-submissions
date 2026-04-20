class Solution {
    public boolean flag = false;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        if(sum%2!=0)
            return false;
        part(0,sum/2,nums,new ArrayList<Integer>());

        return flag;
    }

    public void part(int i, int sum, int[] nums, List<Integer> list){

        if(i>=nums.length){
            int temp=0;
            for(int it:list){
                temp+=it;
            }
            if(temp==sum){
                flag = true;
                return ;
            }
            return ;
        }

        list.add(nums[i]);
        part(i+1,sum,nums,list);
        list.remove(list.size()-1);
        part(i+1,sum,nums,list);
        

    }
}
