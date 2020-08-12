/*
    Problem : 160
    Link : https://leetcode.com/problems/intersection-of-two-linked-lists/
*/
    
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) 
            return null;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            if (curA == null) {
                curA = headB;   //put curA to headB
            } else {
                curA = curA.next;//curA++
            }
            if (curB == null) {
                curB = headA;
            } else {
                curB = curB.next;//curB++  
            }
        }
        return curA;
    }
}

/* Idea
    
   Use Similar Logic as finding the loop in the linked list
*/