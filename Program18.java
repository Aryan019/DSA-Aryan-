// Missing num in an array 
// 1st approach linear search 
//2nd hashing 
// most optimal sum of n and sum of array difference 
// 4th is xor see that again unclear 

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        
        // The sum of numbers from 1 to n is 
        // n * (n+1)/2;
        
        
        int sum = n*(n+1)/2;
        
        
        // Array sum 
        int arr_sum = 0;
        
        for(int i=0;i<arr.length;i++){
            
            arr_sum = arr_sum + arr[i];
            
        }
        
        
        return sum-arr_sum;
    }
}
