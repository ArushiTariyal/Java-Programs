public class BubbleSortRecursive2 {
    public static void bubbleSort(int []a, int n){
        if(n<=1) return;
        int didSwap = 0;
        for(int i = 0; i<=n-2; i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                didSwap = 1;
            }
        }
        if(didSwap==0) return;
        bubbleSort(a,n-1);
    }
    public static void main(String[] args) {
        int[] a = {83,5,3,66,4,7,8,0,9,2,4};
        bubbleSort(a,a.length);
        for(int val:a) System.out.print(val+" ");
    }
}
