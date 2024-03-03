import java.util.ArrayList;
import java.util.List;

public class MoveZerosToEndBrute {
    public static void move(int[] a, List<Integer> temp, int i){
        if(i>=a.length) {
           for(int j=0; j<= a.length-1;j++){
               if(j< temp.size()) a[j] = temp.get(j);
               else a[j] = 0;
           }

            for(int e: a) System.out.print(e+" ");
            return;
        }
        if(a[i]!=0) temp.add(a[i]);
        move(a,temp,i+1);

    }

    public static void main(String[] args) {
        int[] a = {3,0,4,30,0,6,5,0,7,5,0,4,0,6,0};
        List<Integer> temp = new ArrayList<>();
        move(a,temp,0);
    }
}
