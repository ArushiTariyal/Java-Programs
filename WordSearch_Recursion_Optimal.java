public class WordSearch_Recursion_Optimal {
    class Solution {
        public boolean wordSearch(int ind, int i, int j, String word, char[][] board){
            if(ind==word.length()) return true;
            if(board[i][j]== ' ' || board[i][j]!=word.charAt(ind)) return false;

            char temp = board[i][j];
            board[i][j] = ' ';
            boolean ans = false;
            if(i-1>=0) ans |= wordSearch(ind+1,i-1,j,word,board);
            if(i+1<board.length) ans |= wordSearch(ind+1,i+1,j,word,board);
            if(j-1>=0) ans |= wordSearch(ind+1,i,j-1,word,board);
            if(j+1<board[0].length) ans |= wordSearch(ind+1,i,j+1,word,board);
            board[i][j] = temp;

            return ans;
        }
        public boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            if(m*n==1 && word.length()==1 && word.charAt(0)==board[0][0]) return true;
            boolean ans = false;
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    if(board[i][j]==word.charAt(0)){
                        ans = wordSearch(0,i,j,word,board);
                        if(ans==true) return ans;
                    }
                }
            }
            return ans;
        }
    }
}
