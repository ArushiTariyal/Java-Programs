public class GCDUsingModulus_Euclidean_Recursion {
    class Solution {
        public int GCD(int n1, int n2) {
            if(n1==0) return n2;
            if(n2==0) return n1;

            if(n1>n2){
                n1 = n1%n2;
            }
            else{
                n2 = n2%n1;
            }
            return GCD(n1,n2);
        }
    }
}
