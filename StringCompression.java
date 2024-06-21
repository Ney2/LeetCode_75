class Solution {
    public int compress(char[] chars) {
        StringBuilder answer = new StringBuilder();
        int i = 0, j = 0, count = 0;
        while(i < chars.length) {
            if(chars[i] != chars[j]) {
                answer.append(chars[j]);
                if(count != 1) {
                    answer.append(count);
                }
                j = i;
                count = 0;
            }
            count++;
            i++;
        }
        answer.append(chars[j]);
        if(count != 1) {
            answer.append(count);
        }

        for(int k = 0; k < answer.toString().length(); k++) {
            chars[k] = answer.charAt(k);
        }
        
        return answer.toString().length();
    }
}