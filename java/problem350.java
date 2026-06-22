class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : nums1){
            if (!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i) + 1);
            }
        }
        for (int i : nums2){
            if (map.containsKey(i)){
                if (map.get(i)>=1){
                    result.add(i);
                    map.put(i,map.get(i) - 1);
                }
            }
        }
        int[] finalArray = result.stream().mapToInt(i -> i).toArray();
        return finalArray;
    }
}