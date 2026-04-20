class Solution {
    public int[] countBits(int n) {
        
        int[] res = new int[n+1];
        for(int i=0;i<=n;i++){
            res[i] = hammingWeight(i);
        }

        return res;
    }

    public int hammingWeight(int n) {
        int cnt=0;

        while(n>0){
            cnt += n%2;
            n /= 2;
        }

        return cnt;
    }
}
