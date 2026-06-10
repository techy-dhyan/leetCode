class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        temp = 0
        low = 0
        high = len(nums) - 1
        for i in range(len(nums)/2):
            temp = nums[low]
            nums[low] = nums[high]
            nums[high] = temp
            low += 1
            high -= 1
        print(nums)
        k %= len(nums)
        nums[:k] = nums[:k][::-1]
        nums[k:] = nums[k:][::-1]     