class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] result = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                for (int a = Math.max(0,i-k);a<=Math.min(i+k,m-1);a++){
                    for (int b = Math.max(0,j-k);b<=Math.min(j+k,n-1);b++){
                        result[i][j] += mat[a][b];
                    }
                }
            }
        }
        return result;
    }
}