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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        {
            return null;
        }
        
        ListNode temp=head;
        int length=0;
        int mid;
        temp=head;
        if(length==2)
        {
            head.next=null;
            return head;
        }

        ListNode slow=head;
        ListNode fast=head;
        temp=head;
        while(fast!=null)
        {
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                temp=slow;
                slow=slow.next;
            }
        }
        
        // while(temp.next!=slow)
        // {
        //     temp=temp.next;
        // }
        temp.next=slow.next;
        

        return head;
    }
}