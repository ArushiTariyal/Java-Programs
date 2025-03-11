import java.io.*;
import java.util.*;
public class SubstringWithKDistinct_Optimal {
    //{ Driver Code Starts
// Initial Template for Java

    class Solution {
        int countSubstr(String s, int k) {
            // your code here
            return maxCount(s,k)-maxCount(s, k-1);
        }

        public static int maxCount(String s, int k){
            int left = 0;
            int ans = 0;
            HashMap<Character, Integer> hm = new HashMap<>();

            for(int right = 0; right<s.length(); right++){

                hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right),0)+1);

                while(hm.size()>k){
                    hm.put(s.charAt(left), hm.get(s.charAt(left))-1);
                    if(hm.get(s.charAt(left))==0) hm.remove(s.charAt(left));
                    left++;
                }

                ans += right -left +1;
            }

            return ans;
        }
    }
}
