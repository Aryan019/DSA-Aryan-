//intersection-of-two-sorted-array

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();

            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            line = read.readLine();
            tokens = line.split(" ");
            for (String token : tokens) {
                array2.add(Integer.parseInt(token));
            }

            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr1 = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr1[idx++] = i;

            int[] arr2 = new int[array2.size()];
            idx = 0;
            for (int i : array2) arr2[idx++] = i;

            v = new Solution().printIntersection(arr1, arr2);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[]) {
        // add your code here
        
       
       // Initializing an array list for it 
    //   ArrayList<Integer> myList = new ArrayList<>();
       LinkedHashSet<Integer> myList = new LinkedHashSet<>();
        
        // Using in the 2 pointer approach for it 
        
        int i=0;
        int j=0;
        
        int n = arr1.length;
        int m = arr2.length;
        
        
        while(i<n && j<m){
            
            
            if(arr1[i]<arr2[j]){
                i++;
            }
            
            else if(arr2[j]<arr1[i]){
                j++;
            }
            
            else{
                    
                myList.add(arr1[i]);    
                i++;
                j++;
                
            }
            
            
            
            
            
        }
        
        if(myList.size()==0){
            
            myList.add(-1);
            
            
            
            ArrayList<Integer> newList = new ArrayList<>(myList);
            return newList;
        }
        
          
            
            ArrayList<Integer> newList = new ArrayList<>(myList);
            return newList;
        
       
    }
}
