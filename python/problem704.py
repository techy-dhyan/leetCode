class Solution(object):
    def search(self, nums, target,low=0,high=None):
        if high == None:
            high = len(nums)-1
        if target not in nums:
            return -1
        mid = (low + high)//2
        if nums[mid] == target:
            return mid
        elif nums[mid] > target:
            return self.search(nums,target,low,mid-1)
        else:
            return self.search(nums,target,mid+1,high)