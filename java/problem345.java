class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && vowels.indexOf(sb.charAt(left))<0) {
                left++;
            }
            while (left < right && vowels.indexOf(sb.charAt(right))<0) {
                right--;
            }
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        return sb.toString();
    }
}