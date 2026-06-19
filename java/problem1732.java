class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] result = new int[n + 1];
        int sum = 0;
        result[0] = 0;
        for (int i = 0;i<n;i++){
            sum += gain[i];
            result[i + 1] = sum;
        }
        int max = Integer.MIN_VALUE;
        for (int i : result){
            max = Math.max(i,max);
        }
        return max;
    }
}