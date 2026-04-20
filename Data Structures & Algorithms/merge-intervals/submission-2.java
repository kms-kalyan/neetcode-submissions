class Solution {
    public int[][] merge(int[][] in) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(in, (a,b)->Integer.compare(a[0],b[0]));
        int n=in.length;
        int min=0,max=0;
        for(int i=0;i<n;i++){
            min = in[i][0];
            max = in[i][1];
            while(i+1<n && in[i+1][0]<=max){
                max = Math.max(max,in[i+1][1]);
                i++;
            }
            list.add(new int[]{min,max});
        }

        int[][] res = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }

        return res;
    }
}
