public class BubbleSortRecursive3 {
    public static void bubbleSort(int []a, int n){
        if(n<=1) return;
        swap(a,n,0);
        bubbleSort(a,n-1);
    }
    public static void swap(int[] a, int l,int i){
        if(i>=l-1) return;
        if(a[i]>a[i+1]) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        swap(a,l,i+1);
    }
    public static void main(String[] args) {
        int[] a = {83,5,3,66,4,7,8,0,9,2,4};
        bubbleSort(a,a.length);
        for(int val:a) System.out.print(val+" ");
    }
}

