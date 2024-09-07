// String manipulation 3

class Solution {

    public String compareTo(String s1 ,String s2){

        int n = Math.min(s1.length(),s2.length());

        // Initializing a String Builder 
        StringBuilder sb = new StringBuilder();

    // Starting in the loop to check 

    for(int i=0; i<n; i++){
        if(s1.charAt(i)==s2.charAt(i)){
            sb.append(s1.charAt(i));

        }
        else{
            break;
        }
    }

    return sb.toString();

    }


    public String longestCommonPrefix(String[] strs) {

        String res = strs[0];

        for(int i=1;i<strs.length;i++){

           res = compareTo(res,strs[i]);
        }

        return res;
        
    }
}