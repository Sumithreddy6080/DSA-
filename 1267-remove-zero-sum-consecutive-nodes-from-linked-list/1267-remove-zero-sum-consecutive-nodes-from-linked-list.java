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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode mover = head;
        HashMap<Integer , ListNode> map = new HashMap<>();
        map.put(0,dummy);
        int sum =0;
        while(mover != null){
            sum += mover.val;
            if(map.containsKey(sum)){
                ListNode node = map.get(sum);
                node.next = mover.next;
                map.clear();
                ListNode temp = dummy;
                int t =0;
                while(temp != mover.next && temp!= null){
                    t+= temp.val;
                    map.put(t,temp);
                    temp= temp.next;
                }
            }else{
                map.put(sum,mover);
            }
            mover = mover.next;
        }
        return dummy.next;

    }
}