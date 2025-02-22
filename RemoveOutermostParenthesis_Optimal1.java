public class RemoveOutermostParenthesis_Optimal1 {
    class Solution {
        public String removeOuterParentheses(String s) {
            String ans = "";
            int cnt = 0;
            for(int i = 0; i<s.length(); i++){
                if(cnt ==0){
                    cnt++;
                    continue;
                }
                else{
                    if(s.charAt(i)=='('){
                        ans += '(';
                        cnt++;
                    }
                    else{
                        cnt--;
                        if(cnt!=0) ans += ')';
                    }
                }
            }
            return ans;
        }
    }
}
