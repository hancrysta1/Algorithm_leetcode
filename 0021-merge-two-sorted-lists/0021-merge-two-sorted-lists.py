# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        #header는 따로 지정하지 않음, 존재여부 확인X
        result = ListNode()
        while list1 and list2:
            if list1.val < list2.val:
                result.next = list1
                list1 = list1.next
            elif list2.val < list1.val:
                result.next = list2
                
            


        