// Using the optimal approach for
// the union of two sorted array 

import java.util.ArrayList;

public class Program13 {

    public static void main(String[] args) {
        
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 6, 7};

        int n1 = arr1.length;
        int n2 = arr2.length;

        // The above are two sorted arrays 

        // Using in the optimal approach 

        // Using in the two pointer approach 

        // Defining in the arraylist for it 

        ArrayList<Integer> myList = new ArrayList<>();

        int i= arr1[0];
        int j = arr2[0];

        while(i< n1 && j<n2){

            // Checking if arr1 pointer less than the second 
            if(arr1[i]<=arr2[j]){

                // Now checking in that it is present in the arrayList or not as last 
                if(myList.size()==0 || myList.contains(arr1[i])){
                    myList.add(arr1[i]);
                }
                i++;
            

            }

            else{

                 // Now checking in that it is present in the arrayList or not as last 
                 if(myList.size()==0 || myList.contains(arr2[j])){
                    myList.add(arr2[j]);
                }
                j++;

            }
        }

        while(j<n2){

            if(myList.size()==0 || myList.contains(arr2[j])){
                myList.add(arr2[j]);
            }
            j++;



        }

        while(i<n1){

              // Now checking in that it is present in the arrayList or not as last 
              if(myList.size()==0 || myList.contains(arr1[i])){
                myList.add(arr1[i]);
            }
            i++;

        }


        // The arrayList is now ready 

    }
    
}
