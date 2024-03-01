public class BubbleSortRecursive {
    public static void bubbleSort(int[] a, int n){
        if(n<=1) return;
        bubbleSort(a,n-1);
        compare(a,n-1,n-1);
    }
    public static void compare(int[] a , int len, int ei){
        if(len<=0 || a[len-1] <= a[ei]) return;

        int t = a[len-1];
        a[len-1] = a[ei];
        a[ei] = t;
        compare(a,len-1,ei-1);


    }
    public static void main(String[] args) {
        int[] a = {83,5,3,66,4,7,8,0,9,2,4};
        bubbleSort(a,a.length);
        for(int val:a) System.out.print(val+" ");
    }
}
