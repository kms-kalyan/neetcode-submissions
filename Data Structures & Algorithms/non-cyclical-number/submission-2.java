class Solution {
    public boolean isHappy(int n) {
        
        

        return happy(n, new ArrayList<>());
    }

    public boolean happy(int n, List<Integer> list){
        
        if(n==1)
            return true;

        int t = 0;
        while(n>0){
            t += Math.pow(n%10,2);
            n/=10;
        }
        
        if(list.contains(t))
            return false;
        else list.add(t);
        
        return happy(t,list);
    }
}
