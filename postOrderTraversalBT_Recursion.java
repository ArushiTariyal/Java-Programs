import java.util.ArrayList;
import java.util.List;

public class postOrderTraversalBT_Recursion {
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
        List<Integer> al = new ArrayList<>();
        public List<Integer> postorderTraversal(TreeNode root) {
            if(root==null) return al;
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            al.add(root.val);
            return al;
        }
    }
}
