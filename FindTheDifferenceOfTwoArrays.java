class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++) {
                list1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
                list2.add(nums2[i]);
        }

        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        for(int num : list1){
            if(!list2.contains(num)) {
                diff1.add(num);
            }
        }

        for(int num : list2){
            if(!list1.contains(num)) {
                diff2.add(num);
            }
        }

        ans.add(diff1);
        ans.add(diff2);

        return ans;
    }
}