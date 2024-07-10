class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, j = 0, zero_count = 0, max_length = 0;
        while(i < nums.length){
            if(nums[i] == 0) {
                zero_count++;
            }

            while(zero_count > 1){
                if(nums[j] == 0){
                    zero_count--;
                }
                j++;
            }

            max_length = Math.max(max_length, i - j + 1);
            i++;
        }

        return max_length - 1;
    }
}