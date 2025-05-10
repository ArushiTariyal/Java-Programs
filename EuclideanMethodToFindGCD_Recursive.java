public class EuclideanMethodToFindGCD_Recursive {
    class Solution {
        public static int recurGCD(int n1, int n2){
            if(n1==0) return n2;
            if(n2==0) return n1;

            int min = Math.min(n1,n2);
            int diff = Math.abs(n1-n2);

            if(diff>min) return recurGCD(diff,min);
            return recurGCD(min,diff);
        }
        public int GCD(int n1, int n2) {
            return recurGCD(n1,n2);
        }
    }
}
