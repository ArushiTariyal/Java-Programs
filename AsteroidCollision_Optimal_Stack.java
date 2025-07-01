import java.util.*;
public class AsteroidCollision_Optimal_Stack{
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i<asteroids.length; i++){
                int val = asteroids[i];
                if(val>0) st.push(val);
                else{
                    while(!st.isEmpty() && st.peek()>0 && st.peek()<-val){
                        st.pop();
                    }
                    if(!st.isEmpty() && st.peek()== -val) st.pop();
                    else if(st.isEmpty() || st.peek()<0) st.push(val);
                }
            }
            int ans[] = new int[st.size()];
            for(int i = st.size()-1; i>=0; i--){
                ans[i] = st.pop();
            }
            return ans;
        }
    }
}
