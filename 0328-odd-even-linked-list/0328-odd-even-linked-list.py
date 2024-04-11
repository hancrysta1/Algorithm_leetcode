# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        headArray=[]
        result=ListNode()
        current=result
        while head:
            headArray.append(head.val)
            head=head.next
            
        temp_list=ListNode()
        temp=temp_list
        for i,data in enumerate(headArray):
            if (i+1)%2!=0:
                current.next=ListNode(val=data)
                current=current.next
            else:
                temp.next=ListNode(val=data)
                temp=temp.next
        while current.next:
            current=current.next
        current.next=temp_list.next
        return result.next

