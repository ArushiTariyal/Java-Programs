import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0; i<len; i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
    }
    public static void bubbleSort(int arr[]){
        for(int i = 0;i<arr.length -1;i++){
            for(int j = 0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array is: ");
        for(int e: arr) System.out.print(e+" ");
    }
}
