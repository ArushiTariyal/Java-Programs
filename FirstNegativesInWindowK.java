import java.util.ArrayList;
import java.util.List;

public class FirstNegativesInWindowK {
    public static void firstNegatives(int[] ip, int k){
        int j = 0, i=0;
        List<Integer> l = new ArrayList<>();
        while(j<ip.length){
            if(ip[j]<0) l.add(ip[j]);
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                if(l.size()==0) System.out.print(0+" ");
                else{
                    System.out.print(l.get(0)+" ");
                    if(l.get(0)==ip[i]) l.remove(0);
                }
                i++;
                j++;

            }
        }
    }
    public static void main(String[] args){
        firstNegatives(new int[] {2,4,-7,5,-9,9,8,7,-3},3);
    }
}
