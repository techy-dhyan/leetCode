import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        for (int i = 0;i<sc.length;i++){
            if (map.containsKey(sc[i])){
                if (map.get(sc[i]) != tc[i] ){
                    return false;
                }
            }
            else{
                if (used.contains(tc[i])){
                    return false;
                }
                map.put(sc[i],tc[i]);
                used.add(tc[i]);
            }
        }
        return true;
    }
}