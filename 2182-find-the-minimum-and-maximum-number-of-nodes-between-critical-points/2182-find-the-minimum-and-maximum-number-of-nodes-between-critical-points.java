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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return new int[]{-1,-1};
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        ListNode c = head.next;
        ListNode n = c.next;
        int i =1;

        while(n != null){
            if(c.val > p.val && c.val> n.val) list.add(i);
            if(c.val < p.val && c.val< n.val) list.add(i);
            p = c;
            c=n;
            n = n.next;
            i++;
        }
        if(list.size() <= 1) return new int[]{-1,-1};
   Collections.sort(list); // O(n log n)

int mind = Integer.MAX_VALUE;
int maxd = list.get(list.size() - 1) - list.get(0); // max - min

for (int k = 1; k < list.size(); k++) {
    int diff = list.get(k) - list.get(k - 1);
    mind = Math.min(mind, diff);
}
        return new int[]{mind,maxd};
    }
}