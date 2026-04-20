class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n1=-1,n2=-1,in=0;
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int l : nums){
            map.put(l,in);
            in++;
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i){
                res[0]=nums[i];
                res[1]=target-nums[i];
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == res[0]){
                res[0] = i;
            }else if(nums[i] == res[1] && i != res[0]){
                res[1] = i;
                break;
            }
        }
        Arrays.sort(res);
        return res;
    }
}
