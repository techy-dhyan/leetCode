class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int p = 1;
        for (int i=0;i<n;i++){
            ans[i] = p;
            p *= nums[i];
        }

        int s = 1;
        for (int i=n-1;i >= 0;i--){
            ans[i] *= s;
            s *= nums[i];
        }
        return ans;
    }
}