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
    public void reorderList(ListNode head) {
        
            ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {


            if (fast.next != null)
                fast = fast.next.next;
            else
                fast = null;

            slow = slow.next;
        }

        //reverse second list
        ListNode second = slow.next;
        ListNode cur = slow.next;
        ListNode prev = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        slow.next = null;

        // merge
        ListNode l1 = head;
        ListNode l2 = prev;

        int count = 0;
        ListNode dummy = new ListNode(-1, null);
        ListNode tail = dummy;
        while (l1 != null && l2 != null) {
            if (count % 2 == 0) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            count++;
            tail = tail.next;
        }

        tail.next = l1 == null ? l2 : l1;

      
    }
}
