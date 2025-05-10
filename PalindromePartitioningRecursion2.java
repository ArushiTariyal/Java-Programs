import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningRecursion2 {
    class Solution {
        public static void checkIfAllPalindromes(List<List<String>> ans, List<String> seq, String str){
            if(str.length()==0){
                ans.add(new ArrayList<>(seq));
                return;
            }

            for(int i = 0; i<str.length(); i++){
                int end = i;
                String substr = str.substring(0,end+1);

                if(isPalindrome(substr)){
                    seq.add(substr);
                    checkIfAllPalindromes(ans,seq,str.substring(end+1));
                    seq.remove(seq.size()-1);

                }
            }
        }
        public static boolean isPalindrome(String substr){
            if(substr.length()==1) return true;
            int start = 0;
            int end = substr.length()-1;
            while(start<=end){
                if(substr.charAt(start)!=substr.charAt(end)) return false;
                start++;
                end--;
            }
            return true;
        }
        public List<List<String>> partition(String s) {
            List<String> seq = new ArrayList<>();
            List<List<String>> ans = new ArrayList<>();
            checkIfAllPalindromes(ans,seq,s);
            return ans;
        }
    }
}
