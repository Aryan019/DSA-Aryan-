
// Middle of the Linked List
// leetcode link -> https://leetcode.com/problems/middle-of-the-linked-list/description/
// Extreme naive approach is n/2 + 1
// Using in the tortoise and the hare algorithm 
// Will move the slow pointer by 1 and the faster pointer by 2 

// Solution 

class Solution {
    public ListNode middleNode(ListNode head) {

        // Applying in the turtle and the hare algo 

        ListNode turtle = head;
        ListNode hare = head;

        // In odd number of nodes it will point 
        // to the last node 

        // In case of even it will point to the first node 
        // after the last node 


        while(hare!=null && hare.next!=null){
            turtle = turtle.next;
            hare = hare.next.next;

        }
        return turtle;
    }
}