import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters_Better {
        class Solution{
            public int  KDisnt(String str, int k){
                int maxlen = 0;
                int l = 0, r = 0;
                Map<Character,Integer> hm = new HashMap<>();
                while(r<str.length()){
                    hm.put(str.charAt(r),hm.getOrDefault(str.charAt(r),0)+1);
                    while(hm.size()>k){
                        hm.put(str.charAt(l),hm.get(str.charAt(l))-1);
                        if(hm.get(str.charAt(l))==0) hm.remove(str.charAt(l));
                        l++;
                    }
                    if(hm.size()<=k) maxlen = Math.max(maxlen,r-l+1);
                    r++;
                }
                return maxlen;
            }
        }
    }


