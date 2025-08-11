import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTInorderTraversal_Iterative {

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
        public List<Integer> inorderTraversal(TreeNode root) {
            Stack<TreeNode> st = new Stack<>();

            while(root!=null || !st.isEmpty()){
                while(root!=null){
                    st.push(root);
                    root = root.left;
                }
                root = st.pop();
                al.add(root.val);

                root = root.right;
            }
            return al;
        }
    }
}
