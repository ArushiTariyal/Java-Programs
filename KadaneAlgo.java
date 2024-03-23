public class KadaneAlgo {
        public static void maxSum(int[] a){
            int sum=0;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i<=a.length-1;i++){
                sum+=a[i];
                maxSum = Math.max(maxSum,sum);
                if(sum<0){
                    sum=0;
                }
            }
            System.out.println(maxSum);
        }
        public static void main(String[] args) {
            maxSum(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        }


}
