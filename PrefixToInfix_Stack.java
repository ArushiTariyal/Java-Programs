import java.util.Stack;
public class PrefixToInfix_Stack {
    public static void main(String[] args){
        String str = "+*23*/56^+842";
        int i = str.length()-1;
        Stack<String> st = new Stack<>();
        while(i>=0){
            String s = String.valueOf(str.charAt(i));
            if(s.matches("[A-Za-z0-9]")){
                st.push(s);
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String val = '(' + t1 + s + t2 + ")";
                st.push(val);
            }
            i--;
        }
        System.out.println(st.pop());
    }
}
