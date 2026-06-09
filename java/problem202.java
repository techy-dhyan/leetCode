class Solution {
    public boolean isHappy(int n) {
        int val = 0;
        ArrayList<Integer> lst = new ArrayList<>();
        while(n != 1){
            if (lst.contains(n)){
                return false;
            }
            lst.add(n);
            val = 0;
            while(n > 0){
                val += (n % 10) * (n % 10);
                n /= 10;
            }
            n = val;
        }
        return true;
    }
}