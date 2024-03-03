public class LinearSearchRecursive {
    public static int linearSearch(int[] a, int i, int val){
        if(i>=a.length) return -1;
        if(a[i]==val) return i;
        return linearSearch(a,i+1, val);
    }
    public static void main(String[] args) {
        int[] a = {4,5,3,4,3,7,9,0};
        int[] b = {1,2,8,9,5,4};
        System.out.println("Index of element: "+ linearSearch(a,0,3));
        System.out.println("Index of element: "+ linearSearch(b,0,3));
    }
}
