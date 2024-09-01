// Brushing up recursion 
// Simple program 

class Solution
{
    
   
    
  public void printNos(int N)
    {
        //Your code here
        
        // Starting with basic recursion 
        
        
        
        printNumber(1, N);
            
        
        
      
    }
    
     private void printNumber(int current, int N) {
        if (current > N) { 
            return;
        }
        System.out.print(current + " "); 
        printNumber(current + 1, N); 
    }
}

