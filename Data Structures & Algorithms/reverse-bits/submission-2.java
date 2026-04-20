class Solution {
    public int reverseBits(int n) {
        
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            // 1. Shift ans to the left to make room for the next bit
            ans <<= 1;
            
            // 2. If the last bit of n is 1, add 1 to ans
            if ((n & 1) == 1) {
                ans++;
            }
            
            // 3. Shift n to the right to process the next bit
            n >>= 1;
        }
        return ans;
    }
}

        // String bits = Integer.toBinaryString(n);
        // // System.out.println(bits);
        // char[] ch = bits.toCharArray();
        // int len = ch.length,t=31;
        // int ans=0;
        
        // for(int i=len-1;i>=0;i--){
        //     ans += (ch[i]-'0') * (int) Math.pow(2,t);
        //     t--;
        // }
        
        // return ans;