// element appearing once and all others appearing twice 

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            System.out.println(new Sol().search(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        
        // One approach of the xor can be use 
        // also map can also be used 
        // and also hashing can also be used there 
        
        
        
        // The most optimal is xor 
        
        int xor = 0;
        
        
        // Iterating over the array 
        for(int i=0;i<n;i++){
            
            xor = xor^arr[i];
        }
        
        
        return xor;
    }
    
    
}
