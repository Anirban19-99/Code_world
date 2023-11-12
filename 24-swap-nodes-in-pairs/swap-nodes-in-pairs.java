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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null )
            return head;
        ListNode start=head;
        ListNode end=head.next;
        if(end==null)
        {
            end.next=head;
            head.next=null;
            return head;
        }
        ListNode next_start=end.next;
        ListNode prev=null;
        ListNode final_head=head.next;
        while(start.next!=null)
        {
            end.next=start;
            start.next=next_start;
            if(prev!=null)
                prev.next=end;
            prev=start;
            start=next_start;
            if(start==null)
                return final_head;
            end=start.next;
            if(end==null)
                return final_head;
            next_start=end.next;
        }

        return final_head;
    }
}