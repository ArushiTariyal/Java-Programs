import java.util.Arrays;
public class ValidAnagram_Brute {
    class Solution {
        public String sortString(String a){
            char[] ch= a.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }
        public boolean isAnagram(String s, String t) {
            s = sortString(s);
            t = sortString(t);
            if(s.equals(t)) return true;
            return false;
        }

    }
}
