class Solution {
    public boolean detectCapitalUse(String word) {
        char[] c = word.toCharArray();
        int upc = 0;
        int loc = 0;
        for (char i : c){
            if (Character.isLowerCase(i)){loc++;}
            else if (Character.isUpperCase(i)){upc++;}
        }
        if (upc == word.length() || loc == word.length()){return true;}
        else if(Character.isUpperCase(c[word.length()-1])){return false;}
        else if (upc == 1 && Character.isUpperCase(c[0])){return true;}
        else {return false;}
    }
}