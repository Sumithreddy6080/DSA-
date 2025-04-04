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
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null || head.next==null) return head;
        ListNode mover = head;
        while(mover.next != null && mover != null){
            if(mover.next != null && mover.val == mover.next.val){
                mover.next = mover.next.next;
            }else{
                mover = mover.next;
            }
        }
        return head;
    }
}