class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> list new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            list.put(arr[i], map.getOrDefaultValue(arr[i], 0) + 1);
        }

        Set<Integer> occ = new HashSet<>();
        for(int value : list.getValues()) {
            if(!occ.add(value)) {
                return false;
            }
        }

        return true;
    }
}
