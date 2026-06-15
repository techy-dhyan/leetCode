class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length - 1;
        Arrays.sort(nums);
        int l = nums[0] * nums[1] * nums[len];
        int r = nums[len] * nums[len - 1] * nums[len - 2];
        return Math.max(l,r);
    }
}