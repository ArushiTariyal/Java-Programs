public class SubstringRecursive {
    public static void substring(String ip, String op, int i){
        if(i>=ip.length()) {
            System.out.println(op);
            return;
        }
        String op1 = op;
        substring(ip,op1,i+1);
        if(op1==""||op1.charAt(op1.length()-1)==ip.charAt(i-1)) {
            String op2 = op;
            op2 += ip.charAt(i);
            substring(ip, op2, i + 1);
        }
    }

    public static void main(String[] args) {
        substring("abcd","",0);
    }
}
