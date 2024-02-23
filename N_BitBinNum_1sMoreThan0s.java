public class N_BitBinNum_1sMoreThan0s {
    public static void solve(int ip, String op, int ones, int zeros){
        if(ip==0){
            System.out.println(op);
            return;
        }
        String op1 = op;
        op1 += "1";
        solve(ip-1,op1,ones+1,zeros);

        if(zeros<ones){
            String op2 = op;
            op2 += "0";
            solve(ip-1,op2,ones,zeros+1);
        }
    }
    public static void main(String[] args) {
        int ip = 4;
        String op = "";
        solve(ip,op,0,0);
    }
}
