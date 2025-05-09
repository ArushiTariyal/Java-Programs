import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisRecursion {
    class Solution {
        public static void createParenthesis(int n, int ind, String str, int open, int close, List<String> ds){
            if(open>n || open<close){
                return;
            }
            if(ind==2*n && open==close){
                ds.add(new String(str));
                return;
            }

            createParenthesis(n,ind+1,str+"(",open+1,close,ds);
            if(ind !=0){
                createParenthesis(n,ind+1, str+")",open,close+1,ds);
            }


        }
        public List<String> generateParenthesis(int n) {
            List<String> ds = new ArrayList<>();
            String str = "";
            createParenthesis(n,0,str,0,0,ds);
            return ds;
        }
    }
}
