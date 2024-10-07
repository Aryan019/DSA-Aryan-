// Total number of occourences of a particular element in an sorted array 
//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        
        // no of occourences of x in the array 
        
        // So to solve this using the approach of 
        // finding in the first and the last occourence and 
        // then subtracting in the difference 
        // to get the answer 
        
        
        // Code for finding in the first occourence 
        
        // Implementing lower bound finds the first index 
        
        int low = 0;
        int high = arr.length-1;
        int first_occour = arr.length;
        
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]>=x){
                first_occour = mid;
                high = mid -1;
                
                
            }
            
            else{
                low = mid +1;
            }
            
            
        }
        
        if(first_occour==n || arr[first_occour]!=x){
            return 0;
            
        }
        
        
        // Finding in the last occourence 
        
           low = 0;
         high = arr.length-1;
         int last_occour = arr.length;
        
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]>x){
                last_occour = mid;
                high = mid -1;
                
                
            }
            
            else{
                low = mid +1;
            }
            
            
        }
        
        // As the pointer will point to the last occourence + 1;
        
        last_occour--;
       
        
        int noOfOccour = last_occour - first_occour;
        
        return noOfOccour + 1;
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}