/*
Problem : 24 
Title : Swap Nodes in Pairs
https://leetcode.com/problems/swap-nodes-in-pairs/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
       ListNode dummy = new ListNode(-1);
       dummy.next = head;
       ListNode current = dummy;
        while(current.next!=null && current.next.next!=null)
        {
            ListNode p1 = current.next;
            ListNode p2 = current.next.next;
            p1.next = p2.next;
            p2.next = p1;
            current.next = p2;
             if(current.next.next==null)
                break;
             current = current.next.next;
        }
    return dummy.next;         
        
    }
}