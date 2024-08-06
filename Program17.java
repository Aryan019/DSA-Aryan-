// // frequency-of-array-elements

// //{ Driver Code Starts
// import java.io.*;
// import java.util.*;

// class GFG {
    
//     public static void main (String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//         //testcases
//         int t = Integer.parseInt(br.readLine().trim()); 
//         while(t-->0){
            
//             //size of array
//             int N = Integer.parseInt(br.readLine().trim()); 
//             int arr[] = new int[N];
//             String inputLine[] = br.readLine().trim().split(" ");

//             //adding elements to the array
//             for(int i = 0 ; i < N; i++){
//                 arr[i]=Integer.parseInt(inputLine[i]); 
//             }
//             int P= Integer.parseInt(br.readLine().trim());
//             //calling frequncycount() function
//             Solution ob = new Solution();
//             ob.frequencyCount(arr, N, P); 
            
//             //printing array elements
//             for(int i = 0; i < N ; i++)
//                 System.out.print(arr[i] + " " );
//             System.out.println();
//         }
//     }
// }




// // } Driver Code Ends


// class Solution{
//     //Function to count the frequency of all elements from 1 to N in the array.
//     public static void frequencyCount(int arr[], int N, int P)
//     {
//         // code here
        
//         // This problem will be solved by hashing in array 
//         // Yet this is little tricky
        
//        int[] hash = new int[arr.length];
       
//        for(int i=0;i<arr.length;i++){
           
//            if(arr[i]<=arr.length){
               
//                hash[arr[i]-1] +=1;
               
//            }
//        }
       
       
//        for(int j=0;j<arr.length;j++){
           
//            arr[j] = hash[j];
           
//        }
       
       
//     }
// }


// // Best approach 
// class Solution {
//     // Function to count the frequency of all elements from 1 to N in the array.
//     public static void frequencyCount(int arr[], int N, int P) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Populate the HashMap with the frequency of each element in arr
//         for (int num : arr) {
//             if (map.containsKey(num))
//                 map.put(num, map.get(num) + 1);
//             else
//                 map.put(num, 1);
//         }

//         // Update the array with the frequency of each element from 1 to N
//         for (int i = 0; i < N; i++) {
//             if (map.containsKey(i + 1))
//                 arr[i] = map.get(i + 1);
//             else
//                 arr[i] = 0;
//         }
//     }
// }


