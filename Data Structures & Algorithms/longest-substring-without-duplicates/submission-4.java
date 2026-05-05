class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            while(list.contains(c)){
                list.remove(0);
            }
            list.add(c);
            maxLen = Math.max(list.size(),maxLen);
        }

        return maxLen;
    }
}
