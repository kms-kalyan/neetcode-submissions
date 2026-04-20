class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int l = s.length();

        if(l<=1)
            return true;
        for(int i=0;i<=l/2;i++){
            if(s.charAt(i) != s.charAt(l-i-1))
                return false;
        }

        return true;
    }
}
