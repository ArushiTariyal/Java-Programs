import java.util.Stack;
public class ValidParenthesis_Stack {
    class Solution {
        public boolean isValid(String s) {
            int i = 0;
            Stack<Character> st = new Stack<>();
            while(i<s.length()){
                char val = s.charAt(i);
                if(val=='(' || val=='{' || val=='[') st.push(val);
                else if(!st.isEmpty() && (val==')' && st.peek()=='('|| val==']' && st.peek()=='['|| val=='}' && st.peek()=='{')) st.pop();
                else return false;
                i++;
            }
            return st.isEmpty();
        }
    }
}
