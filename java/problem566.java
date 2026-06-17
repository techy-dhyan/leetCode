class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if (m*n != c*r){return mat;}
        for (int i = 0;i<m*n;i++){
            result[i/c][i%c] = mat[i/n][i%n];
        }
        return result;
    }
}