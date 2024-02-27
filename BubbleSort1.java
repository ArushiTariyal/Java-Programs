public class BubbleSort1 {
    public static void bubbleSort(int[] a){
        for(int i = a.length-1; i>=1; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0) break;
        }
        for(int e: a) System.out.print(e+" ");
    }
    public static void main(String[] args) {
        bubbleSort(new int[] {5,13,9,6,0,4,23,7});
    }
}
