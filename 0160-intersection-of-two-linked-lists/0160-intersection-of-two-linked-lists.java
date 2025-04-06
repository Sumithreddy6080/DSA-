/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1=headA;
        ListNode h2=headB;
        while(h1 != null){
            while(h2!=null){
                if(h1== h2) return h1;
                h2= h2.next;
            }
            h1= h1.next;
            h2= headB;
        }
        return null;
    }
}