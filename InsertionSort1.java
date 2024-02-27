public class InsertionSort1 {
    public static void insertionSort(int[] a){
        for(int i = 1; i<=a.length-1; ++i){
            int pos = i;
            for(int j = i-1; j>=0; --j){
                if(a[j]>a[i]) pos = j;
            }
            for(int k = i-1; k>=pos; --k){
                int temp = a[k];
                a[k] = a[k+1];
                a[k+1] = temp;
            }
        }
        for(int e: a) System.out.print(e+" ");
    }
    public static void main(String[] args) {
        insertionSort(new int[]{6,4,9,0,2});
        
    }
}
