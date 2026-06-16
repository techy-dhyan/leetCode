class Solution {
    public int pivotInteger(int n) {
        if (n==1) {return 1;}
        int sum = n * (n + 1) / 2;
        int left = 0;
        
        for (int i = 1;i<n + 1;i++){
            int right = sum - left;
            if (left + i == right){return i;}
            left += i;
        }return -1;
    }
}