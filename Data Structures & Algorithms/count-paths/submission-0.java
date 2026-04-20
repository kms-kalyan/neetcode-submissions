class Solution {
    public int uniquePaths(int m, int n) {
        return path(0,0,m,n);
    }

    public int path(int i, int j, int m, int n){

        if(i==m-1 && j==n-1)
            return 1;
        if(i>m-1 || j>n-1)
            return 0;
        int r=path(i,j+1,m,n);
        int d=path(i+1,j,m,n);
        return r+d;
    }
}
