public class SudokuSolver_Recursion {
    class Solution {
        public static boolean isValid(char[][] board, int row, int col, int charDig){
            for(int i = 0; i<9; i++){
                if(board[row][i]==charDig) return false;
                if(board[i][col]==charDig) return false;
                // row -> 3* (row)/3 + i/3
                // col -> 3* (col)/3 + i%3
                if(board[3* (row/3) + (i/3)][3*(col/3) + (i%3)]==charDig) return false;
            }
            return true;
        }
        public static boolean solveSudoku2(char[][] board){
            for(int i = 0; i<=8; i++){
                for(int j = 0; j<=8; j++){
                    if(board[i][j]=='.'){
                        for(char c = '1'; c<='9'; c++){
                            if(isValid(board,i,j,c)){
                                board[i][j] = c;
                                if(solveSudoku2(board)) return true; //if a dig fits
                                else{
                                    board[i][j] = '.';  //if that dig doesnt fit
                                }
                            }
                        }
                        return false; //if the current place doesnt allow any dig from 0 to 8, we will change previously chosen dig.
                        // as that prev dig must have been chosen wrong.
                    }

                }
            }
            return true;
        }
        public void solveSudoku(char[][] board) {
            solveSudoku2(board);
        }
    }
}
