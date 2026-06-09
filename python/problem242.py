class Solution(object):
    def isAnagram(self, s, t):
        l=list(s)
        m=list(t)
        l.sort()
        m.sort()
        if l==m:
            return True
        else:
            return False