public class Search2DMatrix2_BinarySearch_Optimal {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int m = matrix[0].length;
            int row = 0, col = m-1;
            while(row<=n-1 && col>=0){
                int mid = matrix[row][col];
                if(mid==target) return true;
                if(mid>target) col--;
                else row++;
            }
            return false;
        }
    }
}
