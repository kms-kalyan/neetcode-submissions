class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0,maxLen=0;
        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            while(list.contains(c)){
                list.remove(0);
            }
            list.add(c);
            len = list.size();
            maxLen = Math.max(len,maxLen);
        }

        return maxLen;
    }
}
