class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        func(res,new ArrayList<>(),0,nums);
        List<List<Integer>> ans = new ArrayList<>(res);
        
        return ans;
    }

    public void func(Set<List<Integer>> res, List<Integer> temp, int i, int[] nums){
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

