public class LeftRotateArrayByDplaceOptimal {
    public static void rotate(int[] a, int d){
        reverse(a,0,d-1);
        reverse(a,d,a.length-1);
        reverse(a,0,a.length-1);
        for(int e: a) System.out.print(e+" ");
    }
    public static void reverse(int[] a, int s, int e){
        while(s<e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            ++s;
            --e;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rotate(a,3);
    }
}
