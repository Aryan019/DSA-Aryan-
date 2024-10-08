// Search in rotated sorted array 
// but it contains duplicates 
// Edge case included 



class Solution {
    public boolean search(int[] nums, int target) {

        // Write the rotated binary search code first 

        // Initialize the low and high 

        int low = 0;
        int high = nums.length-1;


        while(low<=high){

            // Calculating mid here
            int mid = (low+high)/2;

            // if the mid founds out the target     
            if(nums[mid]==target){
                return true;
            }

            // The edge case here 
            if(nums[low]==nums[mid] && nums[high]==nums[mid]){
                low++;
                high--;
                continue;
            }

            // If not identifying the sorted half
            // If the left part is sorted 

            if(nums[low]<=nums[mid]){
                // That means the left part is sorted 

                // Now checking whether the element lies here 
                // or not 

                if(nums[low]<=target && target<=nums[mid]){
                    
                    // Element is present in the left sorted space 
                    // Trimming it down 

                    high = mid - 1;


                }
                else{
                    // The element is not here 
                    low = mid + 1;
                }
            }

            // Checking if the right part is sorted 
            if(nums[mid]<=nums[high]){
                // Yep right is sorted 

                // Checking for the element present 
                if(nums[mid]<=target && target<=nums[high]){
                    // element is present in between 

                    low = mid + 1;

                }
                else{
                    high = mid -1;

                }

            }




        }
        return false;
    }
    
}
