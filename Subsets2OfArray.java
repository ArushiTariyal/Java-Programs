import java.util.ArrayList;

public class Subsets2OfArray {
    public static void subsets(ArrayList<Integer> ip, ArrayList<Integer> op, int i){
        if(i>=ip.size()){
            System.out.println(op);
            return;
        }
        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);

        op2.add(ip.get(i));
        
        subsets(ip,op1,i+1);
        subsets(ip,op2,i+1);
    }
    public static void main(String[] args){
        ArrayList<Integer> ip = new ArrayList<>();
        ip.add(3);
        ip.add(1);
        ip.add(2);
        ArrayList<Integer> op = new ArrayList<>();
        subsets(ip,op,0);
    }
}
