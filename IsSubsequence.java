class Solution {
    public boolean isSubsequence(String s, String t) {
        int currIndex = 0;

        for(int i = 0; i < s.length();  i++) {
            char currChar = s.charAt(i);
            currIndex = t.indexOf(currChar, currIndex);
            if(currIndex == -1) {
                return false;
            }
            currIndex++;
        }
        
        return true;
    }
}