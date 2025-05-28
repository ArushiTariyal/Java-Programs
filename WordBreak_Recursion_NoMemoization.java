import java.util.List;
public class WordBreak_Recursion_NoMemoization {
    class Solution {
        public static boolean checkWord(String s, String create, List<String> wordDict, int ind){
            if(ind==s.length()){
                return create.equals("") || wordDict.contains(create);
            }

            create += s.charAt(ind);

            if(wordDict.contains(create)){
                return (checkWord(s,"",wordDict,ind+1) || checkWord(s,create,wordDict,ind+1));
            }
            else{
                return checkWord(s,create,wordDict,ind+1);
            }
        }
        public boolean wordBreak(String s, List<String> wordDict) {
            return checkWord(s,"",wordDict,0);
        }
    }
}
