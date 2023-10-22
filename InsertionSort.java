public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            for(; j>=0; j--){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }
                else break;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = insertionSort(new int[]{10,1,7,4,8,2,11});
        for(int e: arr) System.out.print(e+" ");
    }
}
