class Solution {
    public int[][] rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int l = 0;
            int h = matrix[0].length - 1;
            while (l < h) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][h];
                matrix[i][h] = temp;
                l++;
                h--;
            }
        }
        return matrix;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        if (Arrays.deepEquals(mat, target)) return true;
        for (int i = 0; i < 3; i++) {
            rotate(mat);
            if (Arrays.deepEquals(mat, target))
                return true;
        }
        return false;
    }
}