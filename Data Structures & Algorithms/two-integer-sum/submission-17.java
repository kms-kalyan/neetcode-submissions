class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n1=-1,n2=-1,in=0;
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]),i};
            
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
