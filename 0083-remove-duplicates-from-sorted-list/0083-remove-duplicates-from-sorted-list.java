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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode cur = head;
        while(cur.next!=null)
        {
            while(cur.next!=null && cur.val == cur.next.val) cur.next = cur.next.next;
            if(cur.next !=null)
              cur = cur.next;
        }
        return head;
        
    }
}