from collections import deque
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        q=collections.deque()
        if not head:
            return True

        while head:
            q.append(head.val)
            head = head.next

        while len(q)>1:
            if q.popleft() != q.pop():
                return False

        return True