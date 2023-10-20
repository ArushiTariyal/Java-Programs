public class SelectionSort {
    public static int[] selectionSort(int[] arr, int n){
        for(int i = 0; i<n-1; i++){
            int minIndex = i;
            for(int y = i+1; y<n; y++){
                if(arr[i]>arr[y]){
                    minIndex = y;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = selectionSort(new int[]{2,5,3,4,8,0},6);
        for(int e: arr) System.out.print(e+" ");
    }
}
