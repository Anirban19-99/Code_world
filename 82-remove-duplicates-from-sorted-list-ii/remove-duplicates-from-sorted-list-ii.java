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

        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode temp=head;
        ListNode temp2=head.next;
        ListNode new_head=null;
        ListNode new_temp=new_head;
        while(temp2!=null)
        {
            if(temp.val!=temp2.val)
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
                temp=temp.next;
                temp2=temp2.next;
                if(temp2==null)
                {
                    new_temp.next=temp;
                    new_temp=new_temp.next; 
                }
                new_temp.next=null;
            }
            else
            {
                
                while((temp.val)==(temp2.val))
                {
                    temp=temp.next;
                    if(temp==null )
                    {
                        return new_head;
                    }
                }
                temp2=temp.next;
                if(temp2==null)
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
            }
    

        }

        return new_head;
        
    }
}