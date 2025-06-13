import java.util.Stack;
public class PostfixToPrefix {
    public static void main(String[] args){
        String str = "23*56/84+2^*+";
        int i = 0;
        Stack<String> st = new Stack<>();
        while(i<str.length()){
            String ch = String.valueOf(str.charAt(i));
            if(ch.matches("[A-Za-z0-9]")){
                st.push(ch);
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String val = ch + t2 + t1;
                st.push(val);
            }
            i++;
        }
        System.out.println(st.pop());
    }
}
