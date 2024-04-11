# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from collections import deque
class Solution:
    def saveToStr(self,my_list: Optional[ListNode])->str:
        my_stack=collections.deque()
        savetostr=''
        while my_list:
            my_stack.append(my_list.val)
            my_list = my_list.next
        while len(my_stack)>0:
            savetostr += str(my_stack.pop())

        return savetostr

    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        l1_result = int(self.saveToStr(l1))
        l2_result = int(self.saveToStr(l2))
        plus_result = str(l1_result+l2_result)
        toLinked = collections.deque()
        for i in plus_result:
            toLinked.append(i)
        result=ListNode()
        current = result
        while len(toLinked)>0:
            if current.next is None:
                current.next=ListNode(val=toLinked.pop())
                current=current.next
        return result.next
            

        
        