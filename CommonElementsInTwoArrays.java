import java.util.HashSet;

public class CommonElementsInTwoArrays {
    public static void main(String[] args){
        int[] a = {1,3,3,4,5,2,6,0};
        int[] b = {5,6,8,2,2,9};
        commonElements(a,b);
    }
    public static void commonElements(int[] a, int[] b){
        HashSet hs1  = new HashSet<>();
        HashSet hs2  = new HashSet<>();
         for(int e: a){
             hs1.add(e);
         }
         for(int e: b){
             hs2.add(e);
         }
         hs1.retainAll(hs2);
        System.out.println("Common elements: "+hs1);
    }
}
