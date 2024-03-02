public class SecondLargestElementBetter {
    public static void sort(int[] a, int l){
        if(l<=1) return;
        sort(a,l-1);
        insert(a,l-1,l-1);
    }
    public static void insert(int[] a, int i, int k){
        if(k<=0 || a[k-1]<=a[i]) {
            a[k] = a[i];
            return;
        }
        int last = a[k-1];
        insert(a,i,k-1);
        a[k] = last;
    }
    public static void secondLargest(int[] a, int max, int secondLargest, int i){
        if(i==a.length || a.length<=1){
            System.out.println(secondLargest);
            return;
        }
        if(a[i]> secondLargest && a[i]<max) secondLargest = a[i];
        secondLargest(a,max,secondLargest, ++i);
    }
    public static void main(String[] args) {
        int[] a = {3,6,3,6,7,2,7,4,37,8,0,5};
        sort(a,a.length);
        for(int e: a) System.out.print(e+" ");
        System.out.println();
        secondLargest(a,a[a.length-1],-1,0);
    }
}
