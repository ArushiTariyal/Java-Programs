import java.util.Arrays;

public class MaxSumOfSubArrayWithSubArrayOptimalN {
    public static void maxSum(int[] a){
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        int low=0,high = 0;
        for(int i = 0; i<=a.length-1;i++){
            sum+=a[i];
            if(maxSum<sum){
                maxSum = sum;
                high=i;
            }
            if(sum<0){
                low=i+1;
                sum=0;
            }
        }
        System.out.println(maxSum);
        for(int i = low; i<=high; i++) System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        maxSum(new int[] {-2,1,-3,4,-1,2,1,-5,4});
    }
}
