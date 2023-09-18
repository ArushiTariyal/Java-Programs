import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0; i<len; i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i<len; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest element is: "+max);
    }
}
