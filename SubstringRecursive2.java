public class SubstringRecursive2 {
    public static void substring(String ip, String op, int i){
        if(i>=ip.length()||(!op.equals("") && op.charAt(op.length()-1)!=ip.charAt(i-1))){
            System.out.println(op);
            return;
        }
            op += ip.charAt(i);
            substring(ip, op, i + 1);
            op = op.substring(0, op.length() - 1);

        substring(ip,op,i+1);
    }
    public static void main(String[] args) {
        substring("asdf","",0);
    }
}
