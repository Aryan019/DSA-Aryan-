// Reversing a ddl - 

class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        
        
        
        // Your code here
        // reversing the linked list 
        
        if(head==null ||head.next==null){
            return head;
            
        }
        
        DLLNode temp = head;
        DLLNode last = null;
        
        
        while(temp!=null){
            
            last = temp.prev;
            temp.prev = temp.next;
            temp.next = last;
            
            temp = temp.prev;
            
            
        }
        
        return last.prev;
    }
}
