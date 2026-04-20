class Solution {
    public int reverse(int x) {
        
        long rev = 0;
        int neg=1;

        if(x<0){
            neg=-1;
            x = neg*x;
        }
        
        while(x>0){
            if(rev * 10 >= (int) Math.pow(2,31))
                return 0;
            rev = rev*10 + x%10;
            x/=10;
        }

        return neg * (int) rev;
    }
}
