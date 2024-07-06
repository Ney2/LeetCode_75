class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix_sum = new int[nums.length];
        int[] postfix_sum = new int[nums.length];

        prefix_sum[0] = nums[0];
        postfix_sum[nums.length - 1] = nums[nums.length - 1];

        for(int i = 1; i < nums.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + nums[i];
        }
        
        for(int i = nums.length - 2; i >= 0;  i--) {
            postfix_sum[i] = postfix_sum[i + 1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(prefix_sum[i] == postfix_sum[i]){
                return i;
            }
        }

        return -1;
    }
}