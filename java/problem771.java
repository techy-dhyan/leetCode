class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : jewels.toCharArray()){
            map.put(i,0);
        }
        for (char i : stones.toCharArray()){
            if (map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
        }
        int sum = 0;
        for (int i : map.values()){
            sum += i;
        }
        return sum;
    }
}