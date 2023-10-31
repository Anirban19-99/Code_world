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
    public boolean isPalindrome(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=head;
        StringBuilder ans=new StringBuilder();
        while(temp1!=null)
        {
            ans.append(temp1.val);
            temp1=temp1.next;
        }
        StringBuilder ans1=new StringBuilder(ans);
        ans1=ans1.reverse();
        System.out.println(ans+"."+ans1+".");
        if(ans.compareTo(ans1)==0)
            return true;
        else
            return false;
        
    }
}