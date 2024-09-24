// Binary search starting 
class Solution {
    public int search(int[] nums, int target) {

        // nums is the array 

        //calculating mid
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            
            int mid = (low+high)/2;

            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return -1;

        
    }
}

// Always write mid = low + (high-low)/2;