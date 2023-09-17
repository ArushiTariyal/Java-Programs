public class ReverseBubbleSort {
    public static void main(String[] args) {
        int[] arr = {33,2,8,0,9,5,1,-4};
        reverseBubbleSort(arr);
    }
    public static void reverseBubbleSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j< arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}
