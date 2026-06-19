import java.util.Map;
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n = nums.length;
        if (n % 2 != 0){return false;}
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (Integer Key: map.keySet()){
            Integer val = map.get(Key);
            if (val != null && val > 2){
                return false;
            }
        }
        return true;
    }
}