// Program to find minimum in a sorted rotated array 

class Solution {
    public int findMin(int[] nums) {

        // minimum in a rotated sorted array 

        // Applying binary search 

        int low = 0;
        int high = nums.length-1;

        int minimumElement = Integer.MAX_VALUE;

        while(low<=high){

            int mid = (low+high)/2;

            // Checking for the sorted and unsorted part here 

            if(nums[low]<=nums[mid]){
                // It is the sorted part 
                if(nums[low]<minimumElement){
                    minimumElement = nums[low];

                }

                low = mid + 1;

            }

            else{
                // It is the unsorted part 
                if(nums[mid]<=minimumElement){
                    minimumElement = nums[mid];
                }

                high = mid - 1;

            }


        }

        return minimumElement;


        
    }
}
