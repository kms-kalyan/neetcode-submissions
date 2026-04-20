class Solution {
    public int[] plusOne(int[] dig) {
        List<Integer> list = new ArrayList<>();
        int n=dig.length;
        int i=n-1;
        while(i>=0 && dig[i]==9){
            list.add(0);
            i--;
        }
        if(i<0)
            list.add(1);
        else list.add(dig[i]+1);
        i--;
        while(i>=0){
            list.add(dig[i]);
            i--;
        }
    
        n=list.size();
        int[] res = new int[list.size()];
        for(int j=list.size()-1;j>=0;j--){
            res[n-j-1] = list.get(j);
        }

        return res;
    }
}
