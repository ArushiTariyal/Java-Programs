public class InsertionSort2 {
    public static void insertionSort(int[] a){
        for(int i = 1; i<=a.length-1; ++i){
            int pos = i;
            for(int j = i-1; j>=0; --j){
                if(a[j]>a[pos]) {
                    int temp = a[pos];
                    a[pos] = a[j];
                    a[j] = temp;
                    pos = j;
                }
                else break;
            }
        }
        for(int e: a) System.out.print(e+" ");
    }
    public static void main(String[] args) {
        insertionSort(new int[]{6,4,9,0,2});

    }
}

