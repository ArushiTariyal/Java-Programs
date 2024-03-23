public class MaxSumOfSubArrayBetterN2 {
    public static void maxSum(int[] arr){
        int maxSum=0;
        int sum;
        for(int i = 0;i<= arr.length-1; i++){
            sum = 0;
            for(int j = i; j<=arr.length-1; j++){
                sum += arr[j];
                if(sum>maxSum){
                    maxSum = sum;
                }

            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        maxSum(new int[] {-2,1,-3,4,-1,2,1,-5,4});
    }
}

