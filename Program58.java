// Deleting a node in the linked list 
// Program link ->
// https://leetcode.com/problems/delete-node-in-a-linked-list/
// Best time complexity solution 
//https://leetcode.com/problems/delete-node-in-a-linked-list/solutions/5113147/
// detailed-explanation-extremely-simple-1-2-liner-o-1-time-and-space-complexity/


// Program code 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        // We are not given the head of the linked list
        // that simply means we are given the node to be deleted so directly do 

        // we are skipping one from the between 
        // and establishing the direct connection 


        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}