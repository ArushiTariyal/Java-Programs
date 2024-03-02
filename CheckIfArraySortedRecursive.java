public class CheckIfArraySortedRecursive{
    public static boolean isSorted(int[] a, int i){
        if(i>=a.length) return true;
        if(a[i]<a[i-1]) return false;
        return isSorted(a,i+1);
    }
    public static void main(String[] args) {
        int[] a = {2,5,6,3,6,3,7,3,9,0};
        int[] b = {4,5,7,8,9,11};
        System.out.println(isSorted(a,1));
        System.out.println(isSorted(b,1));
    }
}
