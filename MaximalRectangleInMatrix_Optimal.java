import java.util.Stack;

public class MaximalRectangleInMatrix_Optimal {
    class Solution {

        public int findHist(int[] psum){
            Stack<Integer> st = new Stack<>();
            int max = 0;
            for(int i = 0; i<psum.length; i++){
                while(!st.isEmpty() && psum[st.peek()]>psum[i]){
                    int val = psum[st.pop()];
                    int pse = st.isEmpty()? -1 : st.peek();
                    int nse = i;
                    max = Math.max(max, val*(nse-pse-1));
                }
                st.push(i);
            }
            while(!st.isEmpty()){
                int val = psum[st.pop()];
                int nse = psum.length;
                int pse = st.isEmpty()? -1: st.peek();
                max = Math.max(max,val*(nse-pse-1));
            }
            return max;
        }
        public int maximalAreaOfSubMatrixOfAll1(char[][] matrix) {

            int row = matrix.length;
            int col = matrix[0].length;
            int[][] psum = new int[row][col];
            for(int i = 0; i<col; i++){
                int sum = 0;
                for(int j = 0; j<row; j++){

                    if(matrix[j][i]=='1') sum += 1;
                    else sum = 0;
                    psum[j][i] = sum;
                }
            }

            int max = 0;
            for(int j = 0; j<row; j++){
                max = Math.max(max,findHist(psum[j]));
            }
            return max;
        }


        public int maximalRectangle(char[][] matrix) {
            return maximalAreaOfSubMatrixOfAll1(matrix);
        }
    }
}
