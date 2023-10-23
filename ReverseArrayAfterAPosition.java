import java.util.Scanner;
public class ReverseArrayAfterAPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        int i = 0;
        System.out.println("Enter elements");
        int[] arr = new int[len];
        while(i<len){
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        arr = reverse(arr,len,pos);
        for(int e: arr) System.out.print(e+" ");
    }
    public static int[] reverse(int[] arr, int len, int pos){
        int i = pos+1;
        int j = len-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
