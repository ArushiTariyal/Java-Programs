public class LeftRotateArrayByOnePlace {
    public static void rotate(int[] a, int i, int first){
        if(i>=a.length-1){
            a[i]=first;
            return;
        }
        a[i] = a[i+1];
        rotate(a,i+1,first);

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        rotate(a,0,a[0]);
        for(int e:a) System.out.print(e+" ");
    }
}
