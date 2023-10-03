import java.util.Stack;
class Solution10 {
    public static boolean isValid(String s) {
        Stack <Character> st = new Stack<Character>();
        if(s.length()%2!=0) return false;
        for(char c: s.toCharArray()){
            if(c == '[' || c=='{' || c=='(') st.push(c);
            else if(c=='}' && !st.isEmpty() && st.peek()=='{') st.pop();
            else if(c==']' && !st.isEmpty() && st.peek()=='[') st.pop();
            else if(c==')' && !st.isEmpty() && st.peek()=='(') st.pop();
            else return false;
        }
        return st.isEmpty();
    }
}
public class ValidParenthesis {
    public static void main(String[] args){
        System.out.println(Solution10.isValid("({}])[]"));
        System.out.println(Solution10.isValid("({[]}){}"));
    }
}
