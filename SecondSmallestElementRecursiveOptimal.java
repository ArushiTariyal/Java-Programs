public class SecondSmallestElementRecursiveOptimal {
    public static void secondSmallest(int[] a, int l, int smallest, int secSmallest){
        if(l==0){
            System.out.println(secSmallest);
            return;
        }
        if(a[l-1]<smallest){
            secSmallest = smallest;
            smallest = a[l-1];
        }
        else if(a[l-1]<secSmallest && a[l-1] != smallest) secSmallest = a[l-1];
        secondSmallest(a,l-1,smallest,secSmallest);
    }
    public static void main(String[] args){
        int[] a = {4,6,3,7,9,4,9,0,7,2,15,74};
        secondSmallest(a, a.length,a[0],-1);
    }
}
