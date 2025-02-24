import java.util.Arrays;

public class LongestCommonPrefix_optimal {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String prefix = "";
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length-1];
            int max = Math.min(first.length(),last.length());
            for(int i = 0; i<max; i++){
                if(first.charAt(i)==last.charAt(i)) prefix += first.charAt(i);
                else break;
            }
            return prefix;
        }
    }
}
