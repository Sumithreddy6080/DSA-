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
        ListNode dummy = new ListNode(0,head);
        ListNode p =dummy;
        ListNode c = head;
        while(c != null){
            boolean is_dup = false;
            while(c.next != null && c.val == c.next.val){
                is_dup = true;
                c = c.next;
            }
            if(is_dup){
                p.next = c.next;
           
            }else{
                p = p.next;
             
            }
            c=c.next;
        }
        return dummy.next;
    }
}