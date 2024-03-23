public class MaxSumOfSubArrayBruteN3 {
    public static void maxSum(int[] arr){
        int maxSum=0;
        int sum = 0;
        for(int i = 0;i<= arr.length-1; i++){

            for(int j = 0; j<=arr.length-1; j++){
                sum = 0;
                for(int k = j; k<=i; k++){
                    sum += arr[k];
                }
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
