class Solution {
    public String removeStars(String s) {
        Stack<Character> new_string = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                new_string.pop();
                continue;
            }

            new_string.push(s.charAt(i));
        }

        Iterator it = new_string.iterator();
        while(it.hasNext()) {
            ans.append(it.next());
        }

        return ans.toString();
    }
}