// Buy and sell stocks 


// gfg

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Program25 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int A[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                A[i] = Integer.parseInt(inputLine[i]);
            }
            int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);
                
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
            if(ans.size()==0)
                System.out.print("No Profit");
            else{
                int c=0;
                for(int i=0; i<ans.size(); i++)
                    c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];
                
                if(c==p)
                    System.out.print(1);
                else
                    System.out.print(0);
            }System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
         ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
        
        // Taking in the pointers 
        int buy=0;
        int sell = 0;
         
        
       
        
        
        // loop to n-1 as we are checking the adjacent elements 
        
        for(int i=0;i<n-1;i++){
            
            if(A[i]<A[i+1]){
                sell++;
                
                
            }
            
            else{
                
                if(sell>buy){
                    
                     ArrayList<Integer> li = new ArrayList<>();
                     
                     li.add(buy);
                     li.add(sell);
                     
                    ans.add(li);
                }
                
                buy = i+1;
                sell = i+1;
            }
            
        }
        
        
                if(sell>buy){
                    
                     ArrayList<Integer> li = new ArrayList<>();
                     
                     li.add(buy);
                     li.add(sell);
                     
                    ans.add(li);    
                }
                
                
                return ans;
        
        
        
    }
}


// leetcode 

class Solution {
    public int maxProfit(int[] prices) {

        

        int minbp = prices[0];

        int maxprofit = 0;

        for(int i=1;i<prices.length;i++){

            int sp = prices[i];

            int profit = sp - minbp;

            if(profit>maxprofit){
                maxprofit = profit;
            }

            if(sp<minbp){
                minbp = prices[i];

            }




            
        }
        
        return maxprofit;
        
    }
}