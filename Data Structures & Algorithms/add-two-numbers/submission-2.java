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
        
        if (l1 == null) {
            return l1;
        }

        ListNode dummy =new ListNode(-1, null);
        ListNode cur = dummy;

        if (l2 == null)
            return l1;

        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int carry = 0;
        while (cur1 != null && cur2 != null) {

            int val = cur1.val + cur2.val;
            int digit = (val % 10) + carry;
                        
            cur.next = new ListNode(digit);

            carry = val / 10;
            cur = cur.next;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        
        while (cur1 != null) {
                System.out.println(cur1.val + " " + carry);
                int val = cur1.val + carry;
                int digit = (val % 10);
                carry = val / 10;
                cur.next = new ListNode(digit);
                cur = cur.next;
                cur1 = cur1.next;
            }
        
        
        while (cur2 != null) {
            int val = cur2.val + carry;
            int digit = (val % 10);
            carry = val / 10;
            cur.next = new ListNode(digit);
            cur = cur.next;
            cur2 = cur2.next;
        }

        if (carry != 0)
            cur.next = new ListNode(carry);
        

        return dummy.next;
    }
}
