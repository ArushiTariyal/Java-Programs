public class PermutationsOfString {
        public static void PermutationString(String ip, String op){
            if(ip.length()==0){
                System.out.println(op);
                return;
            }
            String op1 = op;
            String op2 = op;


            op1 += " "+ip.charAt(0);
            op2 += ip.charAt(0);

            ip = ip.substring(1);
            PermutationString(ip,op1);
            PermutationString(ip,op2);
        }
        public static void main(String[] args) {
            String ip = "ABC";
            String op = "";
            op = Character.toString(ip.charAt(0));
            ip = ip.substring(1);
            PermutationString(ip, op);

        }
    }

