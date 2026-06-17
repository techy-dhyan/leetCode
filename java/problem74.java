class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int l1 = 0;
            int h1 = n - 1;
            while (l1 <= h1){
                int m1 = l1 + (h1 - l1) / 2;
                if (matrix[mid][m1] == target){
                    return true;
                }
                else if (matrix[mid][m1] > target){h1 = m1 - 1;}
                else if (matrix[mid][m1] < target){l1 = m1 + 1;}
            }
            if (target < matrix[mid][0]){high = mid - 1;}
            else if (target > matrix[mid][0]){low = mid + 1;}
        }
        return false;
    }
}