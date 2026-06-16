class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0;i<nums.length;i++){
            int left = i + 1;
            int right = nums.length - 1;
            int sum = nums[i] + nums[left] + nums[right];

            if (sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return sum;
    }
}