import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter elements in sorted order");
        for(int i = 0; i<len ;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        for(int e: arr) System.out.print(e+" ");
        System.out.println();

        System.out.print("Enter the element to search: ");
        int n = sc.nextInt();
        binarySearch(arr,n);
    }
    public static void binarySearch(int arr[], int n){
        int beg = 0;
        int end = arr.length-1;
        int mid;
        while(beg<=end){
            mid = (beg+end)/2;
            if(arr[mid]<n){
                beg = mid+1;
            }
            else if(arr[mid]>n){
                end = mid-1;
            }
            else if(arr[mid] == n){
                System.out.println("Element found at index: "+mid);
                break;
            }
        }
        if(beg>end) System.out.println("Element not found");
    }
}
