// How many times array has been rotated 


class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        
        //Finding in the minimum in an array using 
        
        // Binary search 
            
        int low = 0;
        int high = arr.size()-1;
        int ansIndex = -1; // to keep the remark of the minimum element index 
        int minimumElement = Integer.MAX_VALUE;
        
        while(low<=high){
            
            int mid = (low+high)/2;
            
            // Finding in the sorted half in the array after 
            // the calculation of the mid 
            
            
            // That means the left part of the array is sorted 
            if(arr.get(low)<=arr.get(mid)){
                
                //This is the sorted array 
                if(arr.get(low)<minimumElement){
                    minimumElement = arr.get(low);
                    ansIndex = low;
                }
                
                // Eliminating the sorted half 
                low = mid + 1;
                
                
                
            }
            
            else{
                
                // Here the right one is the sorted array 
                  //This is the sorted array 
                if(arr.get(mid)<minimumElement){
                    minimumElement = arr.get(mid);
                    ansIndex = mid;
                }
                
                high = mid - 1;
                
                
                
            }
            
        }
        
        return ansIndex;
        
    }
}
