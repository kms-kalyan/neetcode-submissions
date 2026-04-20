class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return find(0,nums,target,0);
    }

    public int find(int i, int[] nums, int target, int sum){
        if(i>=nums.length){
            if(target == sum)
                return 1;
            else return 0;
        }
        
        int pos = find(i+1,nums,target,sum+nums[i]);
        int neg = find(i+1,nums,target,sum-nums[i]);

        return pos+neg;
    }
    // public void part(int i, int sum, int[] nums, List<Integer> list, int[] total){

    //     if(i>=nums.length){
    //         int temp=0;
    //         for(int it:list){
    //             temp+=it;
    //         }
    //         if(temp==sum){
    //             cnt++;
    //             return ;
    //         }
    //         return ;
    //     }

    //     list.add(nums[i]);
    //     part(i+1,sum,nums,list);
    //     list.remove(list.size()-1);
    //     part(i+1,sum,nums,list);
        

    // }
}
