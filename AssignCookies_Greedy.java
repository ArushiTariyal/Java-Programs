import java.util.Arrays;

public class AssignCookies_Greedy {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);

            int child = 0;
            int cookie = 0;

            while(cookie<s.length){
                if(s[cookie]>=g[child]){
                    child++;
                }
                cookie++;
                if(child==g.length) break;
            }
            return child;
        }
    }
}
