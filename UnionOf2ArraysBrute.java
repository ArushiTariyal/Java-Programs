import java.util.*;

public class UnionOf2ArraysBrute {
    public static void union(int[] a, int[] b, Set<Integer> s){
        for(int i = 0; i<=a.length-1; i++) s.add(a[i]);
        for(int i = 0; i<=b.length-1; i++) s.add(b[i]);
        int[] ans = new int[s.size()];
        int j = 0;
        for(int ss: s){
            ans[j++] = ss;
        }
        for(int e: ans) System.out.print(e+" ");
    }
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        int[] a = {1,1,1,2,3,4,5,5};
        int[] b = {0,0,1,2,3,7,7};
        union(a,b,s);
    }
}
