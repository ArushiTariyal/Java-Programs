import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalBTIterative {

      public class TreeNode {
          int data;
         TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null; }
      }


    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> preorder(TreeNode root) {
            //your code goes here
            Stack<TreeNode> st = new Stack<>();
            st.push(root);
            while(!st.isEmpty()){
                list.add(st.peek().data);
                TreeNode node = st.pop();
                if(node.right != null) st.push(node.right);
                if(node.left != null) st.push(node.left);
            }
            return list;

        }
    }
}
