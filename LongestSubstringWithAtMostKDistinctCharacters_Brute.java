import java.util.*;
public class LongestSubstringWithAtMostKDistinctCharacters_Brute {
    class Solution{
        public int  KDisnt(int[] arr, int k){
            int maxlen = 0;
            for(int i = 0; i<arr.length; i++){
                Map<Integer,Integer> hm = new HashMap<>();
                for(int j = i; j<arr.length; j++){
                    hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);
                    if(hm.size()>k) break;
                    else{
                        maxlen = Math.max(maxlen,j-i+1);
                    }
                }
            }
            return maxlen;
        }
    }
}
