import java.util.Stack;
public class PrefixToPostfix {
    public static void main(String[] args){
        String str = "+*23*/56^+842";
        int i = str.length()-1;
        Stack<String> st = new Stack<>();
        while(i>=0){
            String ch = String.valueOf(str.charAt(i));
            if(ch.matches("[A-Za-z0-9]")){
                st.push(ch);
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String val = t1 + t2 + ch;
                st.push(val);
            }
            i--;
        }
        System.out.println(st.pop());
    }
}
