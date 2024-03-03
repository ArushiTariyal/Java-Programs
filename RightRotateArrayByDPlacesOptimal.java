public class RightRotateArrayByDPlacesOptimal {
    public static void rotate(int[] a, int d){
        int n= a.length;
        reverse(a,0,n-d-1);
        reverse(a,n-d,n-1);
        reverse(a,0,n-1);
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
        int[] a = {1,2,3,4,5,6,7,8};
        rotate(a,3);
    }
}
