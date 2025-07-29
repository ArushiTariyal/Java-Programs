public class ValidParenthesisString_Recursion_Re {
    class Solution {
        public boolean checkParenthesis(String s, int count, int i){
            if(count<0) return false;
            if(i>=s.length()){
                return count==0;
            }
            if(s.charAt(i)=='(') return checkParenthesis(s,count+1,i+1);
            else if(s.charAt(i)==')') return checkParenthesis(s,count-1,i+1);
            return checkParenthesis(s,count+1,i+1) || checkParenthesis(s,count-1,i+1) || checkParenthesis(s,count,i+1);
        }
        public boolean checkValidString(String s) {
            return checkParenthesis(s,0,0);
        }
    }
}
