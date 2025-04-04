/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode pt1 = head;
        ListNode pt2 = head;
        while(pt2.next!=null)
        {
            pt1  = pt1.next;
            pt2 = pt2.next;
            if(pt2.next!= null) pt2 = pt2.next;
            else break;

        }
        head = pt1;
        return head;
        
    }
}