// // If an array is sorted or not 
// Same YT link as before 

// public class Program6 {

//     //{ Driver Code Starts
// // Initial Template for Java
// import java.io.*;
// import java.util.*;
// import java.util.stream.Collectors;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int t = Integer.parseInt(sc.nextLine());
//         while (t-- > 0) {
//             List<Integer> arr = new ArrayList<>();
//             String input = sc.nextLine();
//             Scanner ss = new Scanner(input);
//             while (ss.hasNextInt()) {
//                 arr.add(ss.nextInt());
//             }
//             Solution ob = new Solution();
//             int ans = ob.print2largest(arr);
//             System.out.println(ans);
//         }
//     }
// }

// // } Driver Code Ends


// // User function Template for Java

// // second largest in an array 

// class Solution {
//     public int print2largest(List<Integer> arr) {
//         // Code Here
            
//         int largest = arr.get(0);
        
//         for(int i=0; i<arr.size(); i++){
            
//             if(arr.get(i)>largest){
//                 largest = arr.get(i);
//             }
            
            
//         }
            
            
//         int second_largest = 0;    
            
//         for(int i=0;i<arr.size();i++){
            
//             if(arr.get(i) < largest && arr.get(i) > second_largest){
//                 second_largest = arr.get(i);
//             }
            
//         }
        
        
//         return second_largest;
        
        
        
//     }
// }
    
// }
