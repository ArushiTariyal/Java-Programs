public class QuickSort {
    public static void quickSort(int[] a, int l, int h){
        if(l<h) {
            int pivot = partition(a, l, h);
            quickSort(a, l, pivot - 1);
            quickSort(a, pivot + 1, h);
        }
    }
    public static int partition(int[] a, int l, int h){
        int piv = l;
        int i = l;
        int j = h;
        while(i<j) {
            while (a[i] <= a[piv] && i <= h-1) {
                i++;
            }
            while (a[j] > a[piv] && j >= l+1) {
                j--;
            }
            if(i<j) {
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        int t = a[j];
        a[j] = a[piv];
        a[piv] = t;
        return j;

    }
    public static void main(String[] args) {
        int[] a = {6,4,3,8,9,2,0,5,4,8,7};
        quickSort(a,0, a.length-1);
        for(int e: a) System.out.print(e+" ");
    }
}
