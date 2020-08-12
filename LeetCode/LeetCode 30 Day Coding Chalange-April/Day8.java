/*

Middle of the Linked List

https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3290/
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
    public ListNode middleNode(ListNode head) {
     
            if(head.next == null)
                return head;
            if(head.next.next==null)
                return head.next;
        
            ListNode fast = head;
            ListNode slow = head;
            
            while(fast.next!=null && fast.next.next!=null)
            {
                fast = fast.next.next;
                slow = slow.next;
            }
        
            if(fast.next==null)
            {
                return slow;
            }
            else
            {
                return slow.next;
            }
        }
}