class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int up = 1;
        int down = -1;
        for (int i = 0;i<n/2;i++){
            result[i] = up;
            result[i+n/2] = down;
            up++;
            down--;
        }
        return result;
    }
}