import java.util.ArrayList;
public class RatInAMaze_Recursion_Optimal {
    class Solution {
        // Function to find all possible paths
        public void findPath(int i, int j, ArrayList<String> ans, String str, int[][] maze, int n){
            if(i==n-1 && j == n-1){
                ans.add(str);
                return;
            }
            if(i<0 || i>n-1|| j<0 || j>n-1 || maze[i][j] != 1) return;

            int temp = maze[i][j];
            maze[i][j] = -1;

            findPath(i+1,j,ans,str+"D",maze,n);
            findPath(i,j-1,ans,str+"L",maze,n);
            findPath(i,j+1,ans,str+"R",maze,n);
            findPath(i-1,j,ans,str+"U",maze,n);

            maze[i][j] = temp;
            return;

        }
        public ArrayList<String> ratInMaze(int[][] maze) {
            ArrayList<String> ans = new ArrayList<>();
            int n = maze.length;
            findPath(0,0,ans,"",maze,n);
            return ans;

        }
    }
}
