public class CheckArraySortedRecursion {
    public static boolean checkSorted(int[] arr,int len, int i){
        if(i==len-1) return true;
        if(arr[i] > arr[i+1]) return false;
        return checkSorted(arr, len, i+1);
    }

    public static void main(String[] args){
        int[] a = {2,3,6,4,3,8,9,0};
        int[] b = {1,3,6,7,8,19,44};
        System.out.println(checkSorted(a,a.length,0));
        System.out.println(checkSorted(b,b.length,0));
    }

}
