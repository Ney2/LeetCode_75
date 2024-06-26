class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0, max = Integer.MIN_VALUE;
        int[] ans = new int[gain.length + 1];
        ans[0] = 0;
        for(int i = 0; i < gain.length; i++) {
            ans[i + 1] += ans[i] + gain[i];
        }

        for(int i = 0; i < ans.length; i++){
            max = Math.max(max, ans[i]);
        }

        return max;
    }
}