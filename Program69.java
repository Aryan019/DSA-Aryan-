// Linked list is a palindrome or not 
// for finding in the middle of the linked list 
// we use the tortoise and the hare algorithm 
// Its one of the V ques 



// Palindrome in a linked list 
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

    public ListNode reversingLinkedList(ListNode newNodeToReverse){

        ListNode temp = newNodeToReverse;
        ListNode prev = null;

        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;

            prev = temp;
            temp = front;
        }

        return prev;


    }

  




    public boolean isPalindrome(ListNode head) {


        



        // Finding in the middle of the linked list 

        // find the middle 
        // hare and turtle 


        ListNode ogHead = head;
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next!=null && hare.next.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }

        // The turtle is now standing before 
        //at the inverting part 
        // Iske aage wale se reverse krna h 


        ListNode newHead = reversingLinkedList(turtle.next);

        while(newHead!=null ){

            if(ogHead.val!=newHead.val){
                reversingLinkedList(newHead);
                return false;

            }
            ogHead = ogHead.next;
            newHead = newHead.next;
        }

        reversingLinkedList(newHead);
        return true;


      




       

        


        

       

        
        
        
    }
}