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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return head;
        int len =0;
        ListNode mover = head;
        while(mover != null){
            len ++;
            mover= mover.next;
        }
        mover = head;
        int move =k;
        while(move>1){
            mover = mover.next;
            move--;
        }
        ListNode fn = mover;
        mover = head;
        move = len-k;
        while(move>0){
            mover = mover.next;
            move--;
        }
         ListNode sn = mover;
         mover = head;
         int temp = fn.val;
         fn.val = sn.val;
         sn.val = temp;
         return head;
    }
}