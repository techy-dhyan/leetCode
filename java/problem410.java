class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for (int i : nums){
            low = Math.max(low,i);
            high += i;
        }
        while (low < high){
            int mid = low + (high - low) / 2;
            int count = 1;
            int sum = 0;
            for (int i : nums){
                if (sum+i>mid){
                    count++;
                    sum = i;
                }
                else{
                    sum += i;
                }
            }
            if (count<=k){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}