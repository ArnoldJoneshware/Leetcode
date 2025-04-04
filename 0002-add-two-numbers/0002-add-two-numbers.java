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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2 == null) return l1;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        
        ListNode head = null;
        int sum ;
        int carry = 0;
        while(cur1!=null && cur2!=null)
        {
            sum = cur1.val + cur2.val + carry;
            if(sum>9)
            {
                carry = sum/10;
                sum = sum%10;
            }
            else carry = 0;
            ListNode node = new ListNode(sum);

            if(head == null) 
            {
                head = node;
                 cur1 = cur1.next;
                 cur2 = cur2.next;
                 continue;
            }
            ListNode cur = head;
            while(cur.next!=null) cur = cur.next;
            cur.next = node;

            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if(cur1==null && cur2 == null && carry == 0) return head;
        while(cur1!=null)
        {
             sum = cur1.val  + carry;
            if(sum>9)
            {
                carry = sum/10;
                sum = sum%10;
            }
            else carry = 0;
            ListNode node = new ListNode(sum);
            ListNode cur = head;

            while(cur.next!=null) cur = cur.next;
            cur.next = node;
            cur1 = cur1.next;
        }
        while(cur2!=null)
        {
             sum = cur2.val  + carry;
             
            if(sum>9)
            {
                carry = sum/10;
                sum = sum%10;
            }
            
            else carry = 0;

            ListNode node = new ListNode(sum);
            ListNode cur = head;
            while(cur.next!=null) cur = cur.next;
            cur.next = node;
            cur2 = cur2.next;
        }
        if(carry!=0)
        {
            ListNode car = new ListNode(carry);
            ListNode cur = head;
            while(cur.next!=null) cur = cur.next;
            cur.next = car;
        }
        return head;
        
        
       
        
        
        
    }
}