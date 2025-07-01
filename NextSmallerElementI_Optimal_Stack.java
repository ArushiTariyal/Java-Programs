import java.util.*;
public class NextSmallerElementI_Optimal_Stack {
    class Solution {
        public int[] nextSmallerElements(int[] arr) {
            // Your code goes here
            Stack<Integer> st = new Stack<>();
            int[] nse = new int[arr.length];
            for(int i = arr.length-1; i>=0; i--){
                while(!st.isEmpty() && st.peek()>=arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()) nse[i] = st.peek();
                else nse[i] = -1;
                st.push(arr[i]);
            }
            return nse;
        }
    }
}
