class Solution {
    public boolean isAnagram(String a, char[] t) {
        if (a.length() != t.length) {
            return false;
        }
        char[] sl = a.toCharArray();
        Arrays.sort(sl);
        return Arrays.equals(sl, t);
    }
    public List<Integer> findAnagrams(String s, String p) {
        char[] tl = p.toCharArray();
        Arrays.sort(tl);
        //if (s.equals("aaabb")){return new ArrayList<>(List.of(3));}
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()){return new ArrayList<>();}
        int win = p.length();
        String temp = s.substring(0,win);
        if (isAnagram(temp,tl)){result.add(0);}
        for (int i = 1;i<s.length() - p.length() + 1;i++){
            temp = s.substring(i,win+i);
            if (isAnagram(temp,tl)){
                result.add(i);
            }
        }
        return result;
    }
}