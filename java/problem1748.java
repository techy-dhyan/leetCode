class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            if (!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i) + 1);
            }
        }
        int sum = 0;
        for (Integer key : map.keySet()){
            Integer value = map.get(key);
            if (value == 1){
                sum += key;
            }
        }
        return sum;
    }
}