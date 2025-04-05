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
       int len =0;
       ListNode mover = head;
       while(mover != null) {
        len++;
        mover = mover.next;
       }
       if(len == n) return head.next;
       mover = head;
       n = len -n;
       while(mover != null){
            n--;
            if(n==0) break;
            mover = mover.next;
       }
       mover.next = mover.next.next;
       return head;
    }
}