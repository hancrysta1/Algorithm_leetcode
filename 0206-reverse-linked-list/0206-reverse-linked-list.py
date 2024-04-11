from collections import deque
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        q=collections.deque()#stack
        result=ListNode()
        current = result
        while head:
            q.append(head.val)
            head = head.next
        
    
        while len(q)>0:
            if current.next is None:
                current.next = ListNode(val=q.pop())
            current=current.next
        
        return result.next

        
        