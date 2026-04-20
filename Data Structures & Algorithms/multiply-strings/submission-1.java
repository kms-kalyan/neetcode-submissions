class Solution {
    public String multiply(String num1, String num2) {
        long n1=0,n2=0;

        for(int i:num1.toCharArray()){
            n1 = n1 * 10 + (i-'0');
        }

        for(int i:num2.toCharArray()){
            n2 = n2 * 10 + (i-'0');
        }

        long n = n1*n2;
        
        StringBuilder sb = new StringBuilder();
        if(n==0)
            return "0";
        while(n>0){
            sb.insert(0,n%10);
            n/=10;
        }

        return sb.toString();
    }
}
