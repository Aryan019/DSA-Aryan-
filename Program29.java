class Solution {
    public String reverseWords(String s) {
        String finalText = "";

        int i=0;
        int N = s.length();

         while(i<N){
        int j;

        while (i < N && s.charAt(i) == ' ') {

            // Finding in the first non space character 
            i++;
        }

        if(i>=N) break;

        j = i+1;


        while(j<N && s.charAt(j)!=' '){

            // Finding out the last index of the word 
            j++;
        }

        

        // i points to the starting of the word and
        // j points to the ending of the word

        // Slicing the word out of the main string 

        String text  = s.substring(i,j);

        if(finalText.length()==0){
            finalText = text;
        }
        else{
            finalText = text + " " + finalText;
        }
        i = j+1;
        }

        return finalText;

        
        
    }
}