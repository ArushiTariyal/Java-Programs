import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTPreOrderTraversal_Iterative {

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
            Stack<TreeNode> st = new Stack<>();
            st.push(root);
            while(!st.isEmpty()){
                TreeNode node = st.pop();
                if(node.right!=null) st.push(node.right);
                if(node.left!=null) st.push(node.left);
                bt.add(node.val);
            }
            return bt;

        }
    }
}
