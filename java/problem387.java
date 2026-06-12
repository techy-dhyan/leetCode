class Solution {
    public int firstUniqChar(String s) {
        for (int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if (s.indexOf(b) == s.lastIndexOf(b)){return i;}
        }
        return -1;
    }
}