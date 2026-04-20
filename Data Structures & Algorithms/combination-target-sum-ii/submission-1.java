class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> set = new HashSet<>();
        comb(set,new ArrayList<>(),0,target,candidates);
        List<List<Integer>> res = new ArrayList<>(set);
        return res;
    }

    public void comb(Set<List<Integer>> res, List<Integer> temp, int i, int target, int[] cand){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }

        if(target<0 || i==cand.length)
            return;
        
        temp.add(cand[i]);
        comb(res,temp,i+1,target-cand[i],cand);
        temp.remove(temp.size()-1);
        comb(res,temp,i+1,target,cand);
    }
}
