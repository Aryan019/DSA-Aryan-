// Anagram 1st approach 
class Solution {
    public boolean isAnagram(String s, String t) {
        
        int lens = s.length();
        int lent = t.length();

        if(lens!=lent){
            return false;
        }

      else{
          char[] chs = s.toCharArray();
          char[] cht = t.toCharArray();

         Arrays.sort(chs);
         Arrays.sort(cht);




          int flag = 0;

        for(int i=0;i<chs.length;i++){
            if(chs[i]!=cht[i]){
                return false;
            }
        }

        return true;

    }

  
}
}