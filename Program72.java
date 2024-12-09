// Deleting the middle of the linked list 
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

        if(head==null || head.next==null){
            return null;
        }

        ListNode hare = head;
        ListNode turtle = head;

        ListNode prev = null;

        while(hare!=null && hare.next!=null){
            prev = turtle;
            turtle = turtle.next;
            hare = hare.next.next;
        }

        // prev is the previous node which is to 
        // be deleted 

        ListNode nodeToDelete = prev.next;
        prev.next = prev.next.next;
        nodeToDelete = null;



        return head;

        
    }
}