import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.print("Enter elements: ");
        for(int i = 0; i<len ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();

        for(int i = 0; i<len/2; i++){
            int j = len-1-i;
            arr[i] += arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] -= arr[j];
        }

        System.out.print("After reversing, the array is: ");
        for(int e: arr){
            System.out.print(e+" ");
        }

    }
}
