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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        if(length==1)
        {
            if(n==1)
            {
                head=null;
                return head;
            }
        }
        ListNode temp1=head;
        if(n==1)
        {
            ListNode temp4=head;
            while(temp4.next.next!=null)
            {
                temp4=temp4.next;
            }
            temp4.next=null;

            return head;

        }
        int index=length-n+1;
        for(int i=1;i<=index-2;i++)
        {
            temp1=temp1.next;
        }
        if(temp1==head && index==1)
        {
            head=temp1.next;
            return head;
        }
        ListNode temp2=temp1.next;
        temp1.next=temp2.next;

        return head;
    }
}