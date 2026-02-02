class Solution(object):
    def reverse(self, x):
        flag = -1 if x<0 else 1
        x = int(str(x * flag)[::-1]) * flag
        return 0 if x > (2 ** 31 - 1) or x < (-2 ** 31) else x

        """
        :type x: int
        :rtype: int
        """
        