class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, zero_flip = 0, max_length = 0;
        while(i < nums.length){
            if(nums[i] == 0){
                zero_flip++;
            }

            while(zero_flip > k){
                if(nums[j] == 0){
                    zero_flip--;
                }
                j++;
            }

            max_length = Math.max(max_length, i - j + 1);
            i++;
        }

        return max_length;
    }
}