public class EuclideanMethodToFindGCD_DoWhileLoop {
    class Solution {
        public static int recurGCD(int n1, int n2){
            int min = Math.min(n1,n2);
            int max = Math.max(n1,n2);
            int diff = 0;
            do{
                diff = Math.abs(max-min);
                if(diff>min) max = diff;
                else{
                    max = min;
                    min = diff;
                }
            }while(diff!=0);
            return max;
        }
        public int GCD(int n1, int n2) {
            return recurGCD(n1,n2);
        }
    }
}
