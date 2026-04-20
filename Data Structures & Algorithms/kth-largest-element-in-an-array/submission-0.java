class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res = 0;
        k = nums.length-k+1;
        for(int i : nums){
            pq.add(i);
        }

        while(k>0){
            res = pq.poll();
            System.out.print(res+" ");
            k--;
        }
        return res;
    }
}
