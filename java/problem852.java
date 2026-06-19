class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 0;
        while (left + 1 < n && arr[left] < arr[left + 1]){
            left++;
        }
        return left;
    }
}