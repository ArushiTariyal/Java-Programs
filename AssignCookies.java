import java.util.Arrays;

public class AssignCookies {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int i = 0;
            int j = 0;

            while(j<s.length && i<g.length){
                if(g[i]<=s[j]) i++;
                j++;
            }
            return i;
        }
    }
}
