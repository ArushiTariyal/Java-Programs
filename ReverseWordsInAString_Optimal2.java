public class ReverseWordsInAString_Optimal2 {
    class Solution {
        public String reverseWords(String s) {
            String rev = "";
            String word = "";
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)!=' '){
                    word += s.charAt(i);
                }
                else{
                    if(!word.equals("")){
                        if(rev != "")
                            rev = word + " " + rev;
                        else rev = word;
                        word = "";
                    }
                }
            }
            if(!word.equals("")){
                if(rev != "") rev  = word + " " + rev;
                else rev = word;
            }
            return rev;
        }
    }
}
