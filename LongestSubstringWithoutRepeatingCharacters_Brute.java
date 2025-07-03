public class LongestSubstringWithoutRepeatingCharacters_Brute {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int len = 0;
            for(int i = 0; i<s.length(); i++){
                int[] hash = new int[256];
                for(int j = i; j<s.length(); j++){
                    if(hash[s.charAt(j)]==1) break;
                    len = Math.max(len,j-i+1);
                    hash[s.charAt(j)] = 1;
                }
            }
            return len;
        }
    }
}
