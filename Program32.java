class Solution {
    public boolean isIsomorphic(String s, String t) {

        // Comparing both the strings length first 

        if(s.length()!=t.length()) return false;

        // Creating in the hash map 

        HashMap<Character, Character> newMap = new HashMap<>();




        // Iterating over the string 

        for(int i=0;i<s.length();i++){

            char original = s.charAt(i);
            char replacement = t.charAt(i);


        if(!newMap.containsKey(s.charAt(i))){

            if(!newMap.containsValue(t.charAt(i))){
                // If the value is also not there 

                newMap.put(original,replacement);

            }

            else{
                return false;
            }

        }

        else{

            // That means it contains the key so find the value out 
            char value = newMap.get(original);

            if(value!=replacement){
                return false;
            }

        }




        }



    return true;

        
    }
}