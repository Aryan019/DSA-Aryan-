// Search in rotated sorted array 

public class Program44 {

    // One approach 
    class Solution {
        // public int search(int[] arr, int target) {
    
        int search(int[] arr, int target) {
    
            int s = 0;
            int e = arr.length - 1;
    
            int pivot = findPivot(arr);
    
            if (pivot == -1) {
                // That means the array is not rotated and now do
                // normal binarysearch
                return BSearch(arr, target, arr.length - 1, 0);
    
            }
    
            if (arr[pivot] == target) {
                return pivot;
    
            }
    
            if (arr[0] > target) {
                s = pivot + 1;
    
                return BSearch(arr, target, e, s);
    
            }
    
            else {
                e = pivot - 1;
    
                return BSearch(arr, target, e, s);
    
            }
    
        }
    
        int BSearch(int[] arr, int target, int e, int s) {
    
            while (s <= e) {
    
                int mid = s + (e - s) / 2;
    
                if (arr[mid] > target) {
                    e = mid - 1;
                }
    
                else if (arr[mid] < target) {
    
                    s = mid + 1;
    
                }
    
                else {
                    return mid;
                }
    
            }
            return -1;
    
        }
    
        int findPivot(int[] arr) {
    
            // 4 cases here
            int s = 0;
            int e = arr.length - 1;
            while (s <= e) {
    
                int mid = s + (e - s) / 2;
    
                if (mid < e && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
    
                if (mid > s && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }
    
                if (arr[s] >= arr[mid]) {
                    e = mid - 1;
                }
    
                else {
                    s = mid + 1;
                }
            }
    
            return -1;
    
        }
    
    }
    
    
}

// Approach 2 
class Solution {
    public int search(int[] nums, int target) {

        // Applying binary search in a rotated array 

        // Intializing the binary search format firstly 

        int low = 0;
        int high = nums.length-1;

        while(low<=high){


            //Calculating mid now 
            int mid = (low+high)/2;

             
            // if element found returning the index 
          if(nums[mid]==target){
            return mid;
          }

          // Identifying the sorted part of the array 
            // left or right

            if(nums[low]<=nums[mid]){
                // Left part is sorted 
                // Identifying whether the element lies within it or not 

                if(nums[low]<=target && target<=nums[mid]){
                    high = mid -1;
                }

                else{
                    low = mid+1;
                }
            }

            else{

                 if(nums[mid]<=target && target<=nums[high]){
                    low = mid +1;
                }

                else{
                    high = mid -1;
                }

            }



        }

        return -1;
        
    }
}
