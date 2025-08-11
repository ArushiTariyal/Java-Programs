import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTPostOrderTraversal_Iterative_2Stacks {

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
            Stack<TreeNode> st1 = new Stack<>();
            Stack<TreeNode> st2 = new Stack<>();

            st1.push(root);
            while(!st1.isEmpty()){
                TreeNode el = st1.pop();
                if(el.left!=null) st1.push(el.left);
                if(el.right!=null) st1.push(el.right);
                st2.push(el);
            }
            while(!st2.isEmpty()){
                al.add(st2.pop().val);
            }
            return al;
        }
    }
}
