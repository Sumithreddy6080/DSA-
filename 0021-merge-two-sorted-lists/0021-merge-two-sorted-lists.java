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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode ans = new ListNode(0);
       ListNode tail = ans;
       while(list1 != null && list2 != null){
        if(list1.val < list2.val){
            ListNode nN = new ListNode(list1.val);
            tail.next = nN;
            tail = nN;
            list1 = list1.next;
        }else{
             ListNode nN = new ListNode(list2.val);
            tail.next = nN;
            tail = nN;
            list2 = list2.next; 
        }
       } 
        tail.next = (list1 != null)? list1 : list2;
        return ans.next;
    }
}