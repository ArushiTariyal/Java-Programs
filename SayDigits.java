import java.util.ArrayList;
import java.util.List;

public class SayDigits {
    public static void sayDig(int n, String[] arr){
        if(n==0) return;
        sayDig(n/10, arr);
        System.out.print(arr[n%10]+" ");
    }
    public static void sayDig1(int n, String[] arr, String[] say, int lastPos){
        if(n==0) return;
        say[lastPos]=arr[n%10];
        sayDig1(n/10, arr, say, lastPos-1);
    }
    public static void main(String[] args) {
        int n = 23455;
        int lastPos = (int)Math.log10(n);
        String[] say = new String[lastPos+1];
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        sayDig(n, arr);
        System.out.println();
        sayDig1(n, arr,say,lastPos);
        for(String e: say) System.out.print(e+" ");
    }
}
