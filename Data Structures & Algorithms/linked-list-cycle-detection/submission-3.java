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
    public boolean hasCycle(ListNode head) {
        

        ListNode cur = head;
        ListNode fast = head != null ? head.next : null;
        while (cur != null) {
        
            if (fast == cur) {
                System.out.println("cyclc: " +fast.val);
                return true;
            }


            if (fast != null && fast.next != null) 
                fast = fast.next.next;
            else
                fast = null;

            cur = cur.next;
        }
        
        return false;
    }
}
