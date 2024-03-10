public class PrintAllPowerSets2 {
    public static void powerSets(String ip, String op, int i){
        if(i>=ip.length()){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;

        op2 += ip.charAt(i);

        powerSets(ip,op1,i+1);
        powerSets(ip,op2,i+1);
    }
    public static void main(String[] args) {
        powerSets("abc","",0);
    }
}
