public class BalancedParenthesis {
        public static void balancedParenthesis(String op, int o, int c){
            if(o==0 && c==0){
                System.out.println(op);
                return;
            }
            if(o>0){
                String op1 = op;
                op1 += '(';
                balancedParenthesis(op1,o-1,c);
            }

            if(o<c){
                String op2 = op;
                op2 += ')';
                balancedParenthesis(op2,o,c-1);
            }

        }
        public static void main(String[] args) {
            int ip = 3;
            String op = "(";
            balancedParenthesis(op,ip-1,ip);

        }
}
