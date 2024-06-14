// Time Complexity : O(n)
// Space Complexity : O(n)
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size = Math.min(word1.length(), word2.length());
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < size; i++) {
            ans.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if(word1.length() > word2.length()) {
            ans.append(word1.substring(word2.length()));
        }

        if(word2.length() > word1.length()) {
            ans.append(word2.substring(word1.length()));
        }

        return ans.toString();
    }
}