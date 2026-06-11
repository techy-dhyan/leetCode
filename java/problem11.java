class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while (low < high){
            int currarea = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(currarea,max);

            if (height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
}