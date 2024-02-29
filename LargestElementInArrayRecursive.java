public class LargestElementInArrayRecursive {
    public static int largestElement(int[] a, int n,int max){
        if(n==0){
            return max;
        }
        max = largestElement(a,n-1,max);
        if(max<a[n-1]) {
            max = a[n-1];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {4,6,3,6,7,3,2,6,8,0};
        System.out.println(largestElement(a,a.length,-1));
    }
}
