import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArraysBrute {
    public static void intersection(int[] a, int n, int[] b, int m, List<Integer> l){
        int[] vis = new int[m];
        for(int i = 0; i<=n-1; i++){
            for(int j = 0; j<=m-1; j++){
                if(vis[j]!=1 && a[i]==b[j]) {
                    l.add(a[i]);
                    vis[j] = 1;
                    break;
                }
                if(b[j]>a[i]) break;
            }
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
