import java.util.ArrayList;

public class LetterCase2Recursive {
        public static void solve(String ip, String op, ArrayList<String> a){
            if(ip.length()==0){
                a.add(op);
                return;
            }

        if(Character.isLetter(ip.charAt(0))){
            String op1 = op;
            String op2 = op;
            op1 += ip.toLowerCase().charAt(0);
            op2 += ip.toUpperCase().charAt(0);
            ip = ip.substring(1);
            solve(ip,op1,a);
            solve(ip,op2,a);
        }
        else{
            String op1 = op;
            op1 += ip.charAt(0);
            ip = ip.substring(1);
            solve(ip,op1,a);
        }

        }
        public static void main(String[] args) {
            ArrayList<String> a = new ArrayList<>();
            String ip = "a1B2";
            String op = "";
            solve(ip,op,a);
            System.out.println(a);
        }


}
