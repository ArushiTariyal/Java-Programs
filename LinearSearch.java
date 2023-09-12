import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0; i<len ;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int n = sc.nextInt();
        linearSearch(arr,n);
    }
    public static void linearSearch(int arr[], int n){

        int i = 0;
        while(i < arr.length){
            if(arr[i] == n){
                System.out.println("Element at index "+i);
                break;
            }
            i++;
        }
        if(i==arr.length) System.out.println("Element not found");
    }
}
