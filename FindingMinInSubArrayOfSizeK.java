import java.util.ArrayList;
import java.util.List;

public class FindingMinInSubArrayOfSizeK {
    public static void findMin(int[] a,int k){
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();
        while(j<=a.length-1){
            if(min>a[j]) min = a[j];
            if(j-i+1 < k) j++;
            else if(j-i+1 ==k){
                ans.add(min);
                if(min==a[i]){
                    min=a[i+1];
                }
                i++;
                j++;

            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        findMin(new int[]{-3,-2,0,8,-8,-16,0},3);
    }
}
