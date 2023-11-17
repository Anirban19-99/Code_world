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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || head.next==null)
            return head;

        ListNode one_node_before=null;
        ListNode one_node_after=null;
        ListNode temp=head;
        ListNode left_node=null;
        ListNode right_node=null;
        ListNode new_head=null;
        
        int count=1;
        
        while(temp!=null)
        {
           if(count==left)
           {
               left_node=temp;
               new_head=left_node;
           }
           if(count==right)
           {
               right_node=temp;
           }

           if(count==(left-1))
           {
               one_node_before=temp;
           }

           if(count==(right+1))
           {
               one_node_after=temp;
           }

           temp=temp.next;
           count++;
           
        }
        right_node.next=null;

        ListNode prev=new_head;
        ListNode cur=new_head.next;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=prev;

            prev=cur;
            cur=next;
        }
        if(one_node_before!=null)
            one_node_before.next=right_node;
        else
            head=right_node;
        left_node.next=one_node_after;

       return head;
    }
}