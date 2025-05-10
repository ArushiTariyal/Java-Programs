import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningRecursion {
    class Solution {
        public static void checkIfAllPalindromes(List<List<String>> ans, List<String> seq, int ind, String str){
            if(ind==str.length()){
                ans.add(new ArrayList<>(seq));
                return;
            }

            for(int i = ind; i<str.length(); i++){
                int start = ind;
                int end = i;
                String substr = str.substring(start,end+1);

                if(isPalindrome(substr)){
                    seq.add(substr);
                    checkIfAllPalindromes(ans,seq,i+1,str);
                    seq.remove(seq.size()-1);
                }
            }
        }
        public static boolean isPalindrome(String substr){
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
            checkIfAllPalindromes(ans,seq,0,s);
            return ans;
        }
    }
}
