import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sl = s.toCharArray();
        char[] tl = t.toCharArray();
        Arrays.sort(sl);
        Arrays.sort(tl);
        return Arrays.equals(sl, tl);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strs));
        List<List<String>> re = new ArrayList<>();
        while (!list.isEmpty()) {
            List<String> temp = new ArrayList<>();
            String current = list.get(0);
            temp.add(current);
            for (int j = list.size() - 1; j >= 1; j--) {
                if (isAnagram(current, list.get(j))) {
                    temp.add(list.get(j));
                    list.remove(j);
                }
            }
            list.remove(0);
            re.add(temp);
        }
        return re;
    }
}