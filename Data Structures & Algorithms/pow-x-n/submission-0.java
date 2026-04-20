class Solution {
    double MOD = (double)1e9;
    public double myPow(double x, int n) {
        if(n>=0)
            return mul(x,n);
        return div(x,n);
    }

    public double mul(double x, int n){
        if(n==0)
            return 1;
        
        return (double) (x * mul(x,n-1))%MOD;
    }

    public double div(double x, int n){
        if(n==0)
            return 1;
        
        return (double) (1 / x * div(x,n+1))%MOD;
    }
}
