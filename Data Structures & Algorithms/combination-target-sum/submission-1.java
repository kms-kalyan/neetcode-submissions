class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        comb(res,new ArrayList<>(),0,target,nums);
        return res;
    }

    public void comb(List<List<Integer>> res, List<Integer> temp, int i, int target, int[] nums){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0 || i >= nums.length) {
            return;
        }
        
        temp.add(nums[i]);
        comb(res,temp,i,target-nums[i],nums);
        temp.remove(temp.size()-1);
        comb(res,temp,i+1,target,nums);
    }
}
