public class LargestElementInArrayBrute {
    public static void sort(int[] a, int l, int h){
        if(l>=h) return;
        int p = div(a,l,h);
        sort(a,l,p-1);
        sort(a,p+1,h);
    }
    public static int div(int[] a, int l, int h){
        int p = l;
        int i = l;
        int j = h;
        while(i<j){
            while( i<=h && a[i]<=a[p] ){
                i++;
            }
            while(j>=l+1 && a[j]>a[p]) {
                j--;
            }
            if(i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[j];
        a[j] = a[p];
        a[p] = t;
        return j;

    }
    public static void main(String[] args){
        int[] a = {34,6,4,8,7,9,8};
        sort(a,0,a.length-1);
        System.out.println(a[a.length-1]);
    }
}
