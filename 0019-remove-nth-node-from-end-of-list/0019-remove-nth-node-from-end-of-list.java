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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        int len =1;
        ListNode mover =head;
        while(mover.next != null){
            len++;
            mover = mover.next;
        }
        if(len == n) return head.next;
        n = len -n;
        mover = head;
        while(n>1){
            n--;
            mover = mover.next;
        }
        if(mover.next != null)mover.next = mover.next.next;
        return head;
    }
}