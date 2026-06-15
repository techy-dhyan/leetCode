class Solution {
    public int[] getAverages(int[] nums, int k) {
        if (2 * k + 1 > nums.length) {
            int[] re = new int[nums.length];
            Arrays.fill(re, -1);
            return re;
        }
        if (k == 0) {
            return nums;
        }
        int[] re = new int[nums.length];
        int right = nums.length - 1;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            re[i] = -1;
            re[right] = -1;
            right--;
        }
        int count = 0;
        for (int i = 0; i < k * 2 + 1; i++) {
            sum += nums[i];
            count++;
        }
        for (int i = k; i < nums.length - k; i++) {
            re[i] = (int) (sum / count);
            if (i < nums.length - k - 1) {
                sum = sum - nums[i - k] + nums[i + k + 1];
            }
        }
        return re;
    }
}