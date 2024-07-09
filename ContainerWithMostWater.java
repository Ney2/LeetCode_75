class Solution {
    public int maxArea(int[] height) {
        int max_area = 0, i = 0, j = height.length - 1;
        while(i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            max_area = Math.max(max_area, area);
            if(height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return max_area;
    }
}