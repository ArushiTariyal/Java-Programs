public class CelebrityProblem_Optimal {
    class Solution {
        public int celebrity(int[][] M) {
            int top = 0, bottom = M.length-1;
            while(top<bottom){
                int t = top;
                int b = bottom;
                if(M[t][b]==1){
                    top++;
                }
                else bottom--;

            }
            if(top>bottom) return -1;
            int cand = top;
            for(int i = 0; i<M.length; i++){
                if(i!=cand){
                    if(M[i][cand]!=1 || M[cand][i]!=0) return -1;
                }
            }
            return top;
        }
    }
}
