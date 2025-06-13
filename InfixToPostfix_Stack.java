import java.util.Stack;
public class InfixToPostfix_Stack {
    public static int priority(char ch){
        if(ch=='^') return 3;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
    }
    public static void main(String[] args){
        String str = "2*3+5/6*(8+4)^2";
        String ans = "";
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<str.length()){
            char ch = str.charAt(i);
            if(String.valueOf(ch).matches("[A-Za-z0-9]")){
                ans += ch;
            }
            else if(ch=='(') st.push(ch);
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans += st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(ch)<=priority(st.peek())){
                    ans += st.peek();
                    st.pop();
                }
                st.push(ch);
            }

            i++;
        }
        while(!st.isEmpty()) {
            ans += st.peek();
            st.pop();
        }
        System.out.println(ans);
    }
}
