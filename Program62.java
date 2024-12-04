// Deleting at a particular k position 

class Solution {
    public Node deleteNode(Node head, int pos) {
        // code here
        
        // given a position to be deleted 
        
        // covering in the edge cases 
        if(head==null || head.next==null){
            return null;
            
        }
        
        // if the head of the linked list has to be removed 
          Node temp = head;
        if(pos==1){
          

            head = head.next;
            head.prev = null;
            
            
            temp.next = null;
            
            
           return head; 
        }
        
        
        int count = 1;
        
        while(temp!=null){
            
            if(count==pos){
                break;
                
            }
            
            count++;
            temp = temp.next;
            
            
            
        }
        
        // we are starting at an element to be deleted
        Node front = temp.next;
        Node back = temp.prev;
        
        // we are deleting the tail 
        
        if(front==null){
            temp.prev = null;
            back.next = null;
            return head;
            
        }
        
        back.next = front;
        front.prev = back;
        
        
        return head;
        
    }
}
