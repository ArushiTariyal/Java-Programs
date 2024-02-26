import java.util.ArrayList;

public class SubsetsSums {
    public static void sum(int[] ip, ArrayList<Integer> op, int i, int sum){
        if(i==ip.length){
            System.out.println(sum);
            return;
        }
        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);

        sum(ip,op1,i+1,sum);


        op2.add(ip[i]);
        sum(ip,op2,i+1,sum+ip[i]);

    }
    public static void main(String[] args) {
        sum(new int[]{2,3},new ArrayList<>(),0,0);
    }
}

