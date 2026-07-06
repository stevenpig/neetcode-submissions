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
public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];

        ListNode tmp = null;
        for (int i = 1; i < lists.length; i++) {
            tmp = merge(lists[i - 1], lists[i]);

            lists[i] = tmp;
        }

        return tmp;
    }

    public ListNode merge(ListNode node1, ListNode node2) {


        if (node1 == null)
            return node2;
        else if (node2 == null)
            return node1;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode cur1 = node1;
        ListNode cur2 = node2;

        while (node1 != null && node2 != null) {

            if (node1.val <= node2.val) {
                tail.next = node1;
                node1 = node1.next;
            } else {
                tail.next = node2;
                node2 = node2.next;
            }
            tail = tail.next;
        }

        if (node1 != null)
            tail.next = node1;
        if (node2 != null)
            tail.next = node2;

        return dummy.next;
    }
}
