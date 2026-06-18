class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i : nums){
            if (!map.containsKey(i)){
            map.put(i,1);
        }
            else {
                map.put(i,map.get(i)+1);
            }
        }
        List<Integer> result = new ArrayList<>();
        map.forEach((key, value) -> {
            if (value > n/3) {
                result.add(key);
            }
        });
        return result;
    }
}