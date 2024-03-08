public class MaxSumOfSubArrayOfSizeK {
    public static int maxSum(int[] arr, int k){
        int i = 0, j = 0,sum = 0, maxi = Integer.MIN_VALUE;
        while(j<=arr.length-1){
            sum = sum + arr[j];
            if(j-i+1 < k) j++;
            else if(j-i+1 == k){
                maxi = Math.max(maxi,sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1,4,2,3,5,1,0,8,1},3));
    }
}
