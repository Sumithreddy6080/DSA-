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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode mover = head;
        while (mover != null) {
            if (set.contains(mover.val)) {
                prev.next = mover.next;
                mover = mover.next;
            } else {
                prev = mover;
                mover = mover.next;
            }
        }
        return dummy.next;
    }
}