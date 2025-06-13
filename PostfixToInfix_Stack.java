import java.util.Stack;
public class PostfixToInfix_Stack {
    public static void main(String[] args){
        String str = "23*56/84+2^*+";
        Stack<String> st = new Stack<>();
        int i = 0;
        while(i<str.length()){
            String ch = String.valueOf(str.charAt(i));
            if(ch.matches("[A-Za-z0-9]")){
                st.push(ch);
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String s = '(' + t2 + ch+ t1 + ')';
                st.push(s);
            }
            i++;
        }
        System.out.println(st.pop());
    }
}
