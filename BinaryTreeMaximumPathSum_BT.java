public class BinaryTreeMaximumPathSum_BT {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
     
    class Solution {
        int max[] = {Integer.MIN_VALUE};
        public int maxPathSum1(TreeNode root, int[] max){
            if(root==null) return 0;
            int lh = Math.max(0,maxPathSum1(root.left,max));
            int rh = Math.max(0,maxPathSum1(root.right,max));

            max[0] = Math.max(max[0],lh+rh+root.val);
            return root.val + Math.max(lh,rh);
        }
        public int maxPathSum(TreeNode root) {
            maxPathSum1(root,max);
            return max[0];
        }
    }
}
