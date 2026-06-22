class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int avg = 0;
        int count = 0;
        for (int i = 0;i<k;i++){
            avg += arr[i];
        }
        if (avg/k >= threshold){count++;}
        for (int i = 1;i<=n-k;i++){
            avg += arr[i+k-1] - arr[i-1];
            if (avg/k >= threshold){count++;}
        }
        return count;
    }
}