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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int length=1;
        ListNode tail = head;
        while(tail.next != null){
            length++;
            tail = tail.next;
        }
        tail.next = head;
        k= k%length;
        int move = length - k;
        ListNode BeforeTheLast = head;
        for(int i=1;i<move;i++){
            BeforeTheLast = BeforeTheLast.next;
        }
        head = BeforeTheLast.next;
        BeforeTheLast.next = null;
        return head;
    }
}