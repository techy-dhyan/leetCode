import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        int n = nums.length;
        int max = -1;
        if (n == k) {
            for (int i : nums) {
                max = Math.max(max, i);
            }
            return max;
        } 
        else if (k == 1) {
            for (Integer key : map.keySet()) {
                Integer val = map.get(key);
                if (val != null && val == 1) {
                    max = Math.max(max,key);
                }
            }
            return max;
        }
        else if (k > 1 && k < n){
            if (map.get(nums[0]) == 1){max = Math.max(max,nums[0]);}
            if (map.get(nums[n - 1]) == 1){max = Math.max(max,nums[n - 1]);}
            return max;
        }
        return -1;
    }
}