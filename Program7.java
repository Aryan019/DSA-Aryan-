// Removing duplicates from sorted array 



public class Program7 {


    class Solution {
        public int removeDuplicates(int[] nums) {
    
           // Using in the two pointer approach here
           // Input is an array 
    
           int i = 0;
    
           for(int j=1;j<nums.length;j++){
    
            // If the element at j is not equal to i then 
    
            if(nums[i]!=nums[j]){
                // Replacing the i+1 element to j 
    
                nums[i+1] = nums[j];
    
                i++;
            }
    
           }
    
           return i+1;
           
    
        }
    }
    
}
