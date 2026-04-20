class Solution {
    public int[][] insert(int[][] in, int[] ni) {
        
        int m=in.length,min=0,max=0;
        List<int[]> list = new ArrayList<>();
        int i=0;
        List<Integer> res = new ArrayList<>();

        while(i<m && in[i][1]<ni[0]){
            list.add(in[i]);
            i++;
        }
        while(i<m && in[i][0]<=ni[1]){
            ni[0] = Math.min(ni[0],in[i][0]);
            ni[1] = Math.max(ni[1],in[i][1]);
            i++;
        }
        list.add(ni);
        while(i<m){
            list.add(in[i]);
            i++;
        }
        

        int[][] ret = new int[list.size()][2];
        for(int j=0;j<list.size();j++){
            ret[j][0] = list.get(j)[0];
            ret[j][1] = list.get(j)[1];
        }
        return ret;
    }
}
