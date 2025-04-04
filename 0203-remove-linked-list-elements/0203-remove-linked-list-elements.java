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
    public ListNode removeElements(ListNode head, int val) {
        while(head == null) return head;
       
        
        while( head!=null && head.val == val)
        {
            head = head.next;
            
        }
        if(head == null) return null;
        ListNode cur = head.next;
        ListNode prev = head;
        
        while(cur!=null)
        {
        

        
        while(cur!=null && cur.val != val)
        {
            prev = cur;
            cur = cur.next;
        }
        if(cur!=null)
        {
            prev.next = cur.next;
            cur = cur.next;
            
        }
    }
        return head;





        
    }
}