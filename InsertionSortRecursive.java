public class InsertionSortRecursive {
    public static void insertionSort(int[] a, int n){
        if(n<=1) return;
        insertionSort(a,n-1);
        insert(a,n-1,a[n-1]);
    }
    public static void insert(int[] a, int l, int ei){
        if(l<=0 || a[l-1]<=ei){
            a[l] = ei;
            return;
        }
        int val = a[l-1];
        insert(a,l-1,ei);
        a[l] = val;
    }
    public static void main(String[] args){
        int a[] = {4,7,5,3,7,9,0,6,4,3};
        insertionSort(a,a.length);
        for(int e : a) System.out.print(e+" ");
    }

}
