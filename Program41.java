// Implementing lower bound 
// Lower bound is smallest index such that arr[index]>= given number 
// arr is [3,5,8,15,19]
// Array has to be sorted for the lower bound to be implemented  

//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

// Binary search 
// Implementing lower bound 

class Searching {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String a[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(a[0]);
            long x = Long.parseLong(a[(int)1]);
            String st[] = read.readLine().trim().split("\\s+");

            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st[i]);
            }

            out.println(new Solution().findFloor(arr, n, x));
        }
        out.close();
    }
}
// } Driver Code Ends


class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        
        // arr is the array 
        // n is the length
        // x se largest chota chahiye 
        
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        
        while(low<=high){
                
            int mid = low + (high-low)/2;
            
            if(arr[mid]<=x){
                ans = mid;
                low = mid +1;
                
                // When you find less than the x then looking for 
                // more greater element than x 
                
            }
            
            else{
                high = mid -1;
            }
            
            
            
            
        }
        
        return ans;
    }
}
