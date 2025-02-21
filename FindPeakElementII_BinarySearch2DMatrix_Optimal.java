public class FindPeakElementII_BinarySearch2DMatrix_Optimal {
    class Solution {
        public int[] findPeakGrid(int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;
            int low = 0, high = m-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                int row = findRowMax(mat,mid);
                int left = mid-1>=0? mat[row][mid-1]: -1;
                int right = mid+1<m? mat[row][mid+1]: -1;
                if(mat[row][mid]>left && mat[row][mid]>right) return new int[]{row,mid};
                else if(mat[row][mid]<left) high = mid-1;
                else low = mid+1;
            }
            return new int[]{-1,-1};
        }
        public int findRowMax(int[][] mat, int col){
            int max = -1;
            int rowNum = -1;
            for(int row = 0; row<mat.length; row++){
                if(mat[row][col]>max){
                    max = mat[row][col];
                    rowNum = row;
                }
            }
            return rowNum;
        }
    }
}
