class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            String value = Integer.toBinaryString(i);
            ans[i] = countOnes(value);
        }

        return ans;
    }

    public int countOnes(String value){
        int count = 0;
        for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i) - '0' == 1){
                count++;
            }
        }

        return count;
    }
}