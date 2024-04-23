public class SquareRootUsingBinarySearch {

    public class Solution {

        public static int sqrtN(long N) {
            long low = 0, high = N;
            while(low<=high){
                long mid = low +(high-low)/2;
                if(Math.pow(mid,2)<=N) low=mid+1;
                else high = mid-1;
            }
            return (int)high;
        }
    }

}
