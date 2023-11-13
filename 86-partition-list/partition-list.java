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
    public ListNode partition(ListNode head, int x) {

        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode new_head=null;
        ListNode new_temp=new_head;
        ListNode new_head_2=null;
        ListNode new_temp_2=new_head_2;
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                if(new_head==null)
                {
                    new_head=temp;
                    new_temp=new_head;
                }
                else
                {
                    new_temp.next=temp;
                    new_temp=new_temp.next;
                }
            }
            else
            {
                if(new_head_2==null)
                {
                    new_head_2=temp;
                    new_temp_2=new_head_2;
                }
                else
                {
                    new_temp_2.next=temp;
                    new_temp_2=new_temp_2.next;
                }
               
            }

            temp=temp.next;
        }

        if(new_head!=null)
        {
            if(new_temp_2!=null)
            {
                new_temp_2.next=null;
                new_temp.next=new_head_2;
            }

        return new_head;
        }
        else
        {
            return new_head_2;
        }

        
    }
}