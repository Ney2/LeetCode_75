class Solution {
    public int maxVowels(String s, int k) {
       List<Character> vowel = new ArrayList<>();
       int j = 0, count = 0, max_count = Integer.MIN_VALUE;
       vowel.add('a');
       vowel.add('e');
       vowel.add('i');
       vowel.add('o');
       vowel.add('u');

       for(int i = 0; i < s.length(); i++) {
        if(vowel.contains(s.charAt(i))){
            count++;
        }
        
        if(i - j + 1 > k) {
            if(vowel.contains(s.charAt(j))) {
                count--;
            }
            j++;
        }
        if(i - j + 1 == k){
            max_count = Math.max(max_count, count);
        }
       }

       return max_count == Integer.MIN_VALUE ? 0 : max_count;
    }
}