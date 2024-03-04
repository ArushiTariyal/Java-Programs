import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArraysOptimal {
    public static void intersection(int[] a, int n, int[] b, int m, List<Integer> l){
        int i = 0, j = 0;
        while(i<=n-1 && j<=m-1){
            if(a[i]==b[j]){
                l.add(a[i]);
                j++;
                i++;
            }
            else if(b[j]<a[i]) j++;
            else i++;
        }
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int[] a = {1,1,1,1,2,2,2,2,3,4,9};
        int[] b = {0,0,1,1,1,2,2,3,4,5,9,9,10};
        intersection(a,a.length,b,b.length,l);
        System.out.println(l);
    }
}
