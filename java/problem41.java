class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            if (i > 0){
            set.add(i);}
        }
        if (set.size()==0){return 1;}
        int max = Collections.max(set);
        for(int i = 1;i<=max;i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}