public class sqrt {
    static class Solution {
        public static int mySqrt(int x) {
            if(x==0|| x==1) return x;
            int start = 2,end = x/2,mid;
            long sqr;
            while(start<=end){
                mid = (start + end)/2;
                sqr = (long)mid*mid;
                if(sqr<x) start = mid+1;
                else if(sqr>x) end = mid-1;
                else return mid;
            }
            return end;
        }
    }
    public static void main(String[] args){
        System.out.println(sqrt.Solution.mySqrt(89));
        System.out.println(sqrt.Solution.mySqrt(25));
    }
}
