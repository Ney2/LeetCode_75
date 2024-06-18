class Solution {
    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i'|| c == 'o'|| c == 'u' ||
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(!isVowel(s.charAt(i))) {
                i++;
                continue;
            }
            if(!isVowel(s.charAt(j))){
                j--;
                continue;
            }

            ans.setCharAt(i, s.charAt(j));
            ans.setCharAt(j, s.charAt(i));
            i++;
            j--;
        }

        return ans.toString();
    }
}

//leetcode
