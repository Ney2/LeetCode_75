class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] array = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = array.length - 1; i >=0; i--) {
            ans.append(array[i]);
            if(i > 0){
                ans.append(" ");
            }
        }

        return ans;
    }
}