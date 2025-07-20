public class ValidParenthesisChecker_Greedy {
    class Solution {
        public boolean checkValid(String s, int ind, int count){
            if(count<0) return false;
            if(ind>=s.length()){
                return count==0;
            }

            if(s.charAt(ind)=='(') return checkValid(s,ind+1,count+1);
            if(s.charAt(ind)==')') return checkValid(s,ind+1,count-1);
            return checkValid(s,ind+1,count+1) || checkValid(s,ind+1,count-1) || checkValid(s,ind+1, count);
        }
        public boolean checkValidString(String s) {
            return checkValid(s,0,0);
        }
    }
}
