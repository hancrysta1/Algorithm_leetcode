# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        head_array=[]
        result=ListNode()
        current=result
        while head:
            head_array.append(head.val)
            head=head.next
        for i,data in enumerate(head_array[::-1]):
            if (len(head_array) - i - 1)+1 == n:
                del head_array[i]

        for e in head_array:
            current.next = ListNode(val=e)
            current=current.next
        return result.next