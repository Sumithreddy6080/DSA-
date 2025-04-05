/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f =head;
        ListNode s= head;
        int length =0;
        while(f!= null && f.next != null ){
            s= s.next;
            f= f.next.next;
            if(s==f){
                length = findLength(s);
                break;
            }
        }
        if(length == 0) return null;
        f=head;
        s=head;
        while(length>0){
            s=s.next;
            length--;
        }
        while(f != null && f.next != null){
            if(s==f) return s;
            f=f.next;
            s=s.next;
        }
        return s;
    }

    int findLength(ListNode slow){
        int len =0;
        ListNode temp = slow;
        do{
            temp = temp.next;
            len++;
        }while(temp != slow);
        return len;
    }
}