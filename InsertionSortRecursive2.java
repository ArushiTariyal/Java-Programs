public class InsertionSortRecursive2 {
    public static void insertionSort(int[] a, int i){
        if(i>=a.length) return;
        insert(a,i-1,i);
        insertionSort(a,i+1);
    }
    public static void insert(int[] a, int j, int i){
        if(j<0||a[j]<=a[i]) return;
        if(a[j]>a[i]){
            int t = a[j];
            a[j] = a[i];
            a[i] = t;
            i = j;
        }
        insert(a,j-1,i);
    }

    public static void main(String[] args) {
        int[] a = {4,5,2,55,6,8,0,1};
        insertionSort(a,1);
        for(int e: a) System.out.print(e+" ");
    }
}
