class Solution {
    public boolean mergeTriplets(int[][] tri, int[] tar) {
        int m = tri.length,n=tri[0].length;
        int cnt=0;
        List<int[]> list = new ArrayList<>();
        for(int[] t : tri){
            if(t[0]>tar[0] || t[1]>tar[1] || t[2]>tar[2])
                continue;
            list.add(t);
        }
        boolean[] b = new boolean[3];
        for(int[] t : list){
            if(t[0]==tar[0])
                b[0]=true;
            if(t[1]==tar[1])
                b[1]=true;
            if(t[2]==tar[2])
                b[2]=true;
        }
            
        
        return b[1]&&b[0]&&b[2];
    }
}
