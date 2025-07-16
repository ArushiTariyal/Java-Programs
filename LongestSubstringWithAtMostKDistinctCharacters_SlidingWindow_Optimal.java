import java.util.*;
public class LongestSubstringWithAtMostKDistinctCharacters_SlidingWindow_Optimal {
    class Solution {
        public int kDistinctChar(String s, int k) {
            //your code goes here
            Map<Character,Integer> hm = new HashMap<>();

            int r = 0, l = 0, maxlen = 0;
            while(r<s.length()){
                hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);

                if(hm.size()>k){
                    hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                    if(hm.get(s.charAt(l))==0) hm.remove(s.charAt(l));
                    l++;
                }

                if(hm.size()<=k) maxlen = Math.max(maxlen, r-l+1);
                r++;
            }
            return maxlen;
        }
    }
}
