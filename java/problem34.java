class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};   
        int l = 0;
        int r = nums.length - 1;
        for (int i=0;i<nums.length;i++){
            if (nums[l] == target){result[0] = l;break;}
            else{l++;}
        }
        for (int i=0;i<nums.length;i++){
            if (nums[r] == target){result[1] = r;break;}
            else{r--;}
        }
        return result;
    }
}