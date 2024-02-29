import java.util.ArrayList;
import java.util.List;

public class SecondLargestElementBrute {
    public static void sort(int[] a, int l, int h){
        if(l>=h) return;
        int mid = l + (h-l)/2;
        sort(a,l,mid);
        sort(a,mid+1,h);
        merge(a,l,mid,h);
    }
    public static void merge(int[] a, int l, int mid, int h){
        int left = l;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left <= mid && right <=h){
            if(a[left] <= a[right]) temp.add(left++);
            else temp.add(right++);
        }
        while(left<=mid) temp.add(left++);
        while(right<=h) temp.add(right++);

        for(int i = l; i<=h; i++) a[i] = temp.get(i-l);
    }
    public static void secondLargest(int[] a){
        sort(a,0,a.length-1);
        int largest = a.length-1;
        int secLargest = -1;
        for(int i = a.length-2; i>=0; i--){
            if(a[i]!= largest) {
                secLargest = a[i];
                break;
            }
        }
        System.out.println(secLargest);
    }
    public static void main(String[] args) {
        secondLargest(new int[] {3,5,2,6,7,34,6,3,4});
    }
}
