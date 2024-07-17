class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min_i = Integer.MAX_VALUE;
        int min_j = Integer.MAX_VALUE;

        for(int num : nums){
            if(num < min_i){
                min_i = num;
            }
            if(num > min_i){
                min_j = Math.min(num, min_j);
            }
            if(num > min_j){
                return true;
            }
        }

        return false;
    }
}