public class PrintAllPowerSets {
    public static void powersets(String ip, String op, int i){
        if(i==ip.length()){
            System.out.println(op);
            return;
        }
        op += ip.charAt(i);
        powersets(ip,op,i+1);
        op = op.substring(0,op.length()-1);
        powersets(ip,op,i+1);
    }
    public static void main(String[] args) {
        powersets("abc","",0);
    }
}
