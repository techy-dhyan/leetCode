class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int b = nums[nums.length - 1];
        for (int i = nums.length - 1;i>=0;i--){
            if (nums[i] != b){
                count++;
                b = nums[i];
            }
            if (count == 3){
                return b;
            }
        }
        return nums[nums.length - 1];
    }
}