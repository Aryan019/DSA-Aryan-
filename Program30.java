// String manipulation 2 

class Solution {
    public String largestOddNumber(String num) {
        

        // Here the num variable contains the string 

        // Traversing from behind 

        int n = num.length()-1;

        while(n>=0){

            // Taking the ascii out of the num string and subtracting by 0
            // will give us the number that is present there 
            int digit = num.charAt(n) - '0';

            if(digit % 2!=0){
                return num.substring(0,n+1);
            }
            n--;
        }

        return "";
    }
}