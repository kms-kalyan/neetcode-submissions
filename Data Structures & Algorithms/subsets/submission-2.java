class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length==0){
            res.add(new ArrayList<>());
            return res;
        }
        func(res,new ArrayList<>(),0,nums);

        return res;
    }

    public void func(List<List<Integer>> res, List<Integer> temp, int i, int[] nums){
        if(i==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[i]);
        func(res,temp,i+1,nums);
        temp.remove(temp.size()-1);
        func(res,temp,i+1,nums);
    }
}
