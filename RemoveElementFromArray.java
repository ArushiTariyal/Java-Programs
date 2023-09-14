public class RemoveElementFromArray {
    public static void main(String[] args){
        int[] arr = {1,2, 3, 4, 5};
        removeElement(arr,3);
    }
    public static void removeElement(int arr[], int key){
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i] == key){
                for(int j = i+1; j<arr.length; j++){
                    arr[j-1] = arr[j];
                }
            }
        }
        for(i = 0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
