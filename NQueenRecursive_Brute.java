import java.util.ArrayList;
import java.util.List;

public class NQueenRecursive_Brute {
    class Solution {
        public static void findQueenBoard(List<List<String>> queen, int n, String[][] board,int col){
            if(col==n){
                List<String> ans = new ArrayList<>();
                for(int i = 0; i<n; i++){
                    String str = "";
                    for(int j = 0; j<n; j++){
                        str += board[i][j];

                    }
                    ans.add(str);
                }
                queen.add(new ArrayList<>(ans));
                return;
            }
            for(int row  = 0; row<n; row++){
                if(isSafe(n, board, row, col)){
                    board[row][col] = "Q";
                    findQueenBoard(queen,n,board,col+1);
                    board[row][col] = ".";
                }
            }
        }
        public static boolean isSafe(int n, String[][] board,int row, int col){
            int r = row;
            int c = col;

            while(r>=0 && c>=0){
                if(board[r][c].equals("Q")) return false;
                r--;
                c--;
            }

            r = row;
            c = col;

            while(c>=0){
                if(board[r][c].equals("Q")) return false;
                c--;
            }

            r = row;
            c = col;
            while(r<n && c>=0){
                if(board[r][c].equals("Q")) return false;
                c--;
                r++;
            }
            return true;
        }
        public List<List<String>> solveNQueens(int n) {
            String[][] board = new String[n][n];
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    board[i][j] = ".";
                }
            }
            List<List<String>> queen = new ArrayList<>();
            findQueenBoard(queen,n,board,0);
            return queen;
        }
    }
}
