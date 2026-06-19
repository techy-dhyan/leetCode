class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int max = 0;
        int left = 0;
        while (left < n - 1) {
            int start = left;
            int up = 0;
            int down = 0;
            while (left + 1 < n && arr[left] < arr[left + 1]) {
                left++;
                up++;
            }
            while (left + 1 < n && arr[left] > arr[left + 1]) {
                left++;
                down++;
            }
            if (up > 0 && down > 0) {
               max = Math.max(max, up + down + 1);
            }
            else{
                left = start + 1;
            }
        }
        return max;
    }
}