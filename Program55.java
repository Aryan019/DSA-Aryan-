// Linked list traversal begins here 
// Trying to implement the linked list here now 



 




public class Program55 {





    static Node convertToLL(int[] arr){

        // We are giving an array here 
        // converting it to the linked list now 

        // array is present here now
        // int[] arr = {2,3,5,6,8,9,10,11};
        
        Node head = new Node(arr[0]);
        // We are not hampering the head here 
        Node mover = head;


        // Applying in the for loop now 
        for(int i=1;i<arr.length;i++){

            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }

        



        return head;
    }

    // Traversing an ongoing formed linked list for that we need the head
    // Of the Linked list 

    static void traversingTheLL(Node head){

        // Here we are starting to traverse the linked list 
        Node temp = head;
        // Not tempering the head bro

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;

            
        }
    }


    public static void main(String[] args) {

        int[] arr = {2,3,5,6,8,9,10,11};
        // Creating in the array above 

        // Calling in the function now 
        Node headOfTheLL = convertToLL(arr);
        System.out.println("here is I am ");
        System.out.println(headOfTheLL.next);
        traversingTheLL(headOfTheLL);
        


        

    }
    
}

class Node{

    int data;
    Node next;

    // Initializing a constructor here
    Node(int data, Node next1){
        this.data = data;
        this.next = next1;

    }
    // Constructor overloading 
    //2
    Node(int data){
        this.data = data;
        this.next = null;

    }

        
}