import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArraysOptimal {
    public static void union(int[] a, int n, int[] b, int m, List<Integer> l){
        int i = 0, j= 0;
        while(i<=n-1 && j<=m-1){
            if(a[i]<=b[j]){
                if (l.size()==0||l.get(l.size()-1)!=a[i]) l.add(a[i]);
                i++;
            }
            else{
               if (l.size()==0||l.get(l.size()-1)!=b[j]) l.add(b[j]);
               j++;
            }

        }
        while(i<=n-1){
            if(l.size()==0|| a[i]!= l.get(l.size()-1)) l.add(a[i]);
            i++;
        }
        while(j<=m-1){
            if(l.size()==0||b[j]!= l.get(l.size()-1)) l.add(b[j]);
            j++;
        }
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int[] a = {1,1,1,1,2,2,2,2,3,4,5};
        int[] b = {0,0,1,2,3,4,9,9,10};
        union(a,a.length,b,b.length,l);
        System.out.println(l);
    }
}
