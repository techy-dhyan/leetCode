class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = "".join(char.lower() for char in s if char.lower() in "abcdefghijklmnopqrstuvwxyz0123456789")
        print(s)
        return s == s[-1::-1]