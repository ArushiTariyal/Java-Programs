public class SelectionSort1 {
    public static void selectionSort(int[] a){
        for(int i = 0; i<=a.length-2; i++){
            int min = i;
            for(int j = i+1; j<=a.length-1; j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min] = temp;
        }
        for(int e: a) System.out.print(e+" ");
    }
    public static void main(String[] args) {
        selectionSort(new int[]{6,4,9,0,2,33,67,8,4,12});
    }
}
