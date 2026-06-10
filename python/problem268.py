class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums).    #2031ms
        for i in range (n+1):
            if i not in nums:
                return i
            
        n = len(nums).    # 3ms
        e = (n * (n + 1)) / 2
        a = 0

        for i in nums:
            a += i
        
        return e - a
