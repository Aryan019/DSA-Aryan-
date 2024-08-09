// 2 sum problemn 

public class Program21 {






    public static void main(String[] args) {


        
    // Brute force 

    int[] arr = {2,6,5,8,11};


    int target = 14;


    for(int i=0; i<arr.length; i++){



        for(int j=i+1;j<arr.length;j++){



            if(arr[i]+arr[j]==target){
                System.out.println("Element found");

                break;
            }
        }
    }
        

    System.out.println("Not found");
    }
}



// better approach 
class Solution {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer,Integer> mymap = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int current_number = nums[i];

            int more_needed = target-nums[i];


            if(mymap.containsKey(more_needed)){

                int theNumber = mymap.get(more_needed);
                
                int[] arr = {theNumber,i};

                return arr;

            }

            mymap.put(nums[i],i);


        }

        int[] arr = {-1,-1};
        return arr;
    }
}