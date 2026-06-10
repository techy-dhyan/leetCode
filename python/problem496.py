class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        l = []
        for i in nums1:
            a = nums2.index(i)
            for j in range(a,len(nums2)):
                if i < nums2[j]:
                    l.append(nums2[j])
                    break
            else:
                l.append(-1)

        return l

