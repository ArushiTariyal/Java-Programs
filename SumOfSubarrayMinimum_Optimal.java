import java.util.*;
public class SumOfSubarrayMinimum_Optimal {
    class Pair{
        int val;
        int ind;
        Pair(int val, int ind){
            this.val = val;
            this.ind = ind;
        }
    }
    class Solution {
        public int[] findNSE(int[] arr){
            int[] nse = new int[arr.length];
            Stack<Pair> st = new Stack<>();
            for(int i = arr.length-1; i>=0; i--){
                while(!st.isEmpty() && st.peek().val>arr[i]) st.pop();
                if(!st.isEmpty()) nse[i] = st.peek().ind;
                else nse[i] = arr.length;
                st.push(new Pair(arr[i],i));
            }
            return nse;
        }
        public int[] findPSE(int[] arr){
            int[] pse = new int[arr.length];
            Stack<Pair> st = new Stack<>();
            for(int i = 0; i<arr.length; i++){
                while(!st.isEmpty() && st.peek().val>=arr[i]) st.pop();
                if(!st.isEmpty()) pse[i] = st.peek().ind;
                else pse[i] = -1;
                st.push(new Pair(arr[i],i));
            }
            return pse;
        }
        public int sumSubarrayMins(int[] arr) {
            int[] nse = findNSE(arr);
            int[] pse = findPSE(arr);
            long total = 0;
            long modulo = 1000000007L;
            for(int i = 0; i<arr.length; i++){
                long left = (nse[i] - i)%modulo;
                long right = (i-pse[i])%modulo;
                long contrib = (left * right)%modulo;
                long totalcontrib = (contrib*arr[i])%modulo;
                total = (total + totalcontrib)%modulo;
            }
            return (int)total;
        }
    }
}
