public class ValidParenthesisString_Recursion {
    class Solution {
        public boolean recurCheckValid(String s, int ind, int cnt){
            if(cnt<0) return false;
            if(ind==s.length()){
                return cnt==0;
            }

            char ch = s.charAt(ind);

            if(ch=='('){
                return recurCheckValid(s,ind+1,cnt+1);
            }

            else if(ch==')'){
                return recurCheckValid(s,ind+1,cnt-1);
            }

            return recurCheckValid(s,ind+1,cnt+1) || recurCheckValid(s,ind+1,cnt-1) || recurCheckValid(s,ind+1,cnt);

        }
        public boolean checkValidString(String s) {
            return recurCheckValid(s,0,0);
        }
    }
}
