class Solution {
    public boolean isHappy(int n) {
        
        List<Integer> list = new ArrayList<>();
        int k=n;
        while(true){
            int t = 0;
            while(k>0){
                t += Math.pow(k%10,2);
                k/=10;
            }
            if(t==1)
                return true;
            if(list.contains(t))
                return false;
            else list.add(t);
            k=t;
        }

        //return false;
    }
}
