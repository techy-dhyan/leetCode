# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        l = ListNode()
        ls1 = []
        ls2 = []
        c1 = l1
        c2 = l2
        s1 ,s2 ,b = 0 ,0, 1
        while c1:
            ls1.append(c1.val)
            c1 = c1.next
        while c2:
            ls2.append(c2.val)
            c2 = c2.next
        while ls1:
            s1 += ls1.pop(0) * b
            b *= 10
        b = 1
        while ls2:
            s2 += ls2.pop(0) * b
            b *= 10
        b = 1
        sol = s1 + s2
        dummy = ListNode(0)
        curr = dummy

        if sol == 0:
            return ListNode(0)

        while sol > 0:
            curr.next = ListNode(sol % 10)
            curr = curr.next
            sol //= 10

        return dummy.next