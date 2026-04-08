public class ValidateBST {

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
        public boolean isValidBSTCheck(TreeNode root, TreeNode min, TreeNode max){
            if(root==null) return true;

            if(min!=null && root.val<=min.val) return false;
            if(max!=null && root.val>=max.val) return false;

            return isValidBSTCheck(root.left,min,root) && isValidBSTCheck(root.right,root,max);
        }
        public boolean isValidBST(TreeNode root) {
            return isValidBSTCheck(root,null, null);
        }
    }
}
