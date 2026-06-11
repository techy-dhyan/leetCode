class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        t = 0
        m = min(nums)
        for i in nums:
            t += i - m
        return t