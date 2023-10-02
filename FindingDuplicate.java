import java.util.ArrayList;
import java.util.List;
class Dupe{
    public static List duplicate(int a[],int n){
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            int val = Math.abs(a[i]);
            int index = val-1;
            if(a[index]<0) l.add(val);
            else a[index] = -a[index];
        }
        return l;
    }
}
public class FindingDuplicate {
    public static void main(String[] args){
        System.out.println(Dupe.duplicate(new int[]{1,2,1,3,4,3,6,6},6));
    }
}
