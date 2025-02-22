public class RemoveOutermostParenthesis_Optimal2 {
    class Solution {
        public String removeOuterParentheses(String s) {
            int cnt = 0;
            String ans = "";
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)==')') cnt--;
                if(cnt !=0) ans += s.charAt(i);
                if(s.charAt(i)=='(') cnt++;
            }
            return ans;
        }
    }
}
