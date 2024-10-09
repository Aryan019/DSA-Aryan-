// Binary search on answers 
// Brute for sq root 


// Function to find square root
// x: element to find square root
class Solution {
    long floorSqrt(long n) {
        // Your code here
        
        
        // Findinng the sqrt via brute and finding in the solution 
        
        long answer = -1;
        
        for(long i=0;i<=n;i++){
            
            if(i*i<=n){
                answer = i;
            }
            else{
                break;
            }
        }
        
        return answer;
    }
}


// Approach 2 main using binary search  