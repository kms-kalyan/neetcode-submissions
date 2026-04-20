class Solution {
    public int lastStoneWeight(int[] stones) {
        int res = 0;
        int len = stones.length, temp = len;
        if(len == 1)
            return stones[0];
        while(temp>0){
            Arrays.sort(stones);
            res = Math.abs(stones[len-1]-stones[len-2]);
            stones[len-1] = stones[len-1]-stones[len-2];
            stones[len-2] = 0;
            temp--;
        }
        return res;
    }
}
