// Binary search on answers 
// Square root of n and m times 
class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        
        // Solving it using binary search 
    
    // m is the number 
    // n is the square root times 
    
    int low = 1;
    int high = m;
    
    while(low<=high){
        
        int mid = (low+high)/2;
        
        
        
        if(Math.pow(mid,n)==m){
            return mid;
        }
        
        else if(Math.pow(mid,n)>m){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
    }
    
    return -1;
    }
}
