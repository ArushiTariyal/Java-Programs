public class SearchIn2DMatrix_BinarySearch_Optimal {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int m = matrix[0].length;
            int low = 0, high = n*m-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(matrix[mid/m][mid%m]==target) return true;
                if(matrix[mid/m][mid%m]>target) high = mid-1;
                else low = mid+1;
            }
            return false;
        }
    }
}
