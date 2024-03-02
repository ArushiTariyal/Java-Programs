public class SelectionSortRecursive {
    public static void sort(int[] a, int i,int min){
        if(i>=a.length-1) return;
        min = findMin(a,i,min);
        swap(a,min,i);
        sort(a,i+1,min);
    }
    public static int findMin(int[] a, int j, int min){
        if(j>=a.length) return min;
        if(a[min]>a[j]) min = j;
        min = findMin(a,j+1, min);
        return min;
    }
    public static void swap(int[] a, int min, int i){
        int k = a[i];
        a[i] = a[min];
        a[min] = k;
    }
    public static void main(String[] args) {
        int[] a = {4,47,34,7,3,7};
        sort(a,0,0);
        for(int e: a) System.out.print(e+" ");;
    }
}
