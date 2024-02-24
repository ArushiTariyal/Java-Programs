import java.util.ArrayList;

public class SubsetsOfArray {
    public static void subsets(int i, ArrayList<Integer> op, ArrayList<Integer> ip){
        if(i>=ip.size()){
            System.out.println(op);
            return;
        }
        op.add(ip.get(i));
        subsets(i+1,op,ip);
        op.remove(ip.get(i));
        subsets(i+1,op,ip);
    }
    public static void main(String[] args){
        ArrayList<Integer> ip = new ArrayList<>();
        ip.add(3);
        ip.add(1);
        ip.add(2);
        ArrayList<Integer> op = new ArrayList<>();
        subsets(0,op,ip);
    }
}
