public class CheckIfArraySortedLoop {
    public static boolean isSorted(int[] a){
        for(int i = 1; i<=a.length-1; i++){
            if(a[i-1]>a[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {2,5,6,3,6,3,7,3,9,0};
        int[] b = {4,5,7,8,9,11};
        System.out.println(isSorted(a));
        System.out.println(isSorted(b));
    }
}
