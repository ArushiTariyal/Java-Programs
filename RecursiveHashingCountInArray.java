import java.util.Scanner;
public class RecursiveHashingCountInArray {
    static Scanner sc = new Scanner(System.in);
    public static int[] fillArr(int[] a, int l, int i, int[] arr){
        if(i==l) return arr;
        arr[a[i]] += 1;
        return fillArr(a, l, i+1, arr );
    }
    public static int findMax(int[] arr, int l, int max, int i){
        if(i==l) return max;
        if(max<arr[i]) max = arr[i];
        return findMax(arr,l,max,i+1);
    }
    public static String hashing(int[] arr, int l, int times){
        if(times==0) return "Program Completed";
        System.out.print("Enter the num to count: ");
        int ask = sc.nextInt();
        if(ask>=l){
            System.out.println("count is: "+0);
        }
        else System.out.println("count is: "+arr[ask]);
        return hashing(arr,l,times-1);
    }
    public static void main(String[] args) {
        System.out.print("How many queries: ");
        int times = sc.nextInt();
        int[] a = {1,4,5,6,3,3,7,9,5,8,8,8,8};
        int max = findMax(a, a.length, a[0],1);
        int[] arr = new int[max+1];
        fillArr(a,a.length,0,arr);
        System.out.println(hashing(arr,arr.length,times));
    }
}
