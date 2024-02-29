public class LargestElementInArrayOptimal {
    public static int largestElement(int[] a, int n){
        int max = a[0];
        for(int i = 1; i<=n-1; i++){
            if(max<a[i]) max = a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {4,6,3,6,17,3,2,6,8,0};
        System.out.println(largestElement(a,a.length));
    }
}

