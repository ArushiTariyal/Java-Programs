public class RemovingDuplicatesFromSortedArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,4,5,5,5,5,6,7,8,8,8,8,8,8};
        int rd = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]!= arr[rd]){
                arr[++rd] = arr[i];
            }
        }
        System.out.print("Sorted Array is: ");
        for(int i = 0; i<=rd;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
