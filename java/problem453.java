class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int t = 0;
        for (int i : nums){
            if (i < min){
                min = i;
            }
        }
        System.out.print(min);
        for (int j : nums){
            t += j - min;
        }
        return t;
    }
}