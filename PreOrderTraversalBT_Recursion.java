
import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalBT_Recursion {

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
        List<Integer> bt = new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            if(root==null) return bt;
            bt.add(root.val);
            preorderTraversal(root.left);
            return preorderTraversal(root.right);

        }
    }
}
