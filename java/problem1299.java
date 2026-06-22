class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 1;i<n;i++){
            int max = 0;
            for (int j = i;j<n;j++){
                max = Math.max(max,arr[j]);
            }
            result[i-1] = max;
        }
        result[n-1] = -1;
        return result;
    }
}