class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;
        int l=0,h= m*n-1;
        while(l<=h){
            int mi = (l+h)/2;
            int r = mi/n,c=mi%n;
            if(mat[r][c] == target){
                return true;
            }else if(mat[r][c]<target){
                l = mi+1;
            }else{
                h = mi-1;
            }
        }

        return false;

    }
}
