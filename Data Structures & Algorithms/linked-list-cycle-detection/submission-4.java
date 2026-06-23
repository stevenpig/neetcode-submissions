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
           if (head == null)
            return false;

        ListNode fast = head.next == null ? null : head.next.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            if (slow == fast)
                return true;

            if (fast.next != null)
                fast = fast.next.next;
            else
                fast = null;
            


            slow = slow.next;
        }

        return false;
    }
}
