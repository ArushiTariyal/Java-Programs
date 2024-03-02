import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArrayBrute {
    public static void removeDuplicates(int[] a, Set<Integer> s){
        for(int i = 0; i<=a.length-1; i++){
            s.add(a[i]);
        }
    }
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        int[] a = {1,1,2,2,2,2,2,3,3,4,5,6};
        removeDuplicates(a,s);
        for(int e: s) System.out.print(e+" ");
    }
}
