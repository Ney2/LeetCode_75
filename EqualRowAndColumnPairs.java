class Solution {
    public int equalPairs(int[][] grid) {
        Map<Integer,List<Integer>> rows = new HashMap<>();
        Map<Integer,List<Integer>> cols = new HashMap<>();
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            rows.put(i, new ArrayList<>());
            cols.put(i, new ArrayList<>());
            for(int j = 0; j < grid.length; j++){
                rows.get(i).add(grid[i][j]);
                cols.get(i).add(grid[j][i]);
            }
        }

        for(List<Integer> rowList : rows.values()){
            for(List<Integer> colList : cols.values()){
                if(rowList.equals(colList)){
                    count++;
                }
            }
        }

        return count;
    }
}