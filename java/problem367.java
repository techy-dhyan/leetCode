class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while (low <= high){
            int mid = low + (high - low)/2;
            long result = (long) mid * mid;
            if (result == num){return true;}
            else if(result > num){high = mid - 1;}
            else if(result < num){low = mid + 1;}
        }
        return false;
    }
}