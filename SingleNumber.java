class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(ans.containsKey(nums[i])) {
                ans.remove(nums[i]);
            } else {
                ans.put(nums[i], i);
            }
        }

        for(Integer key : ans.keySet()) {
            return key;
        }

        return -1;
    }
}