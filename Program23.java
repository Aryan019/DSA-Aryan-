import java.util.Arrays;
// Majority element one approach 
class Solution {
    public int majorityElement(int[] nums) {

   
        if (nums.length == 1) 
        {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length / 2];
    

        
    }
}



// Better approach 

class Solution {
    public int majorityElement(int[] nums) {

   
       // Using hashing here to make it better 


        HashMap<Integer, Integer> myMap = new HashMap<>();

       for(int i=0;i<nums.length;i++){

        if (myMap.containsKey(nums[i])) {
                // Increment the count if it exists
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
            } else {
                // Add the element with a count of 1 if it does not exist
                myMap.put(nums[i], 1);
            }

           
       }

        // Iterating over the map 
        int majorityCount = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey();
            }
        }

    return -1;
        
    }
}



