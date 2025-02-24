public class ReverseWordsInAString_Optimal {
    class Solution {
        public String reverseWords(String s) {
            int n = s.length();
            String ans = "";
            String revWord = "";
            for(int i = n-1; i>=0; i--){
                String word = "";
                while(i>=0 && s.charAt(i)!=' '){
                    word += s.charAt(i);
                    i--;
                }
                if(!word.equals("")){
                    revWord += " ";
                    for(int j = word.length()-1; j>=0; j--){
                        revWord +=word.charAt(j);

                    }
                }
            }

            return revWord.substring(1);
        }
    }
}
