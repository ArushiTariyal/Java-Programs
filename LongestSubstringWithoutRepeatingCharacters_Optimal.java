public class LongestSubstringWithoutRepeatingCharacters_Optimal {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int l = 0, r = 0;
            int[] hash =  new int[256];
            int longest = 0;
            for(int i = 0; i<hash.length; i++){
                hash[i] = -1;
            }
            while(r<s.length()){
                if(hash[s.charAt(r)]!=-1){
                    if(hash[s.charAt(r)]>=l){
                        l = hash[s.charAt(r)]+1;
                    }
                }
                int len = r-l+1;
                longest = Math.max(longest,len);
                hash[s.charAt(r)] = r;
                r++;
            }
            return longest;
        }
    }
}
