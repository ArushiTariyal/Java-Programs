import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BTPostOrderTraversal_Iterative_1Stack {
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

            st1.push(root);
            while(!st1.isEmpty()){
                TreeNode el = st1.pop();
                if(el.left!=null) st1.push(el.left);
                if(el.right!=null) st1.push(el.right);
                al.add(el.val);
            }
            Collections.reverse(al);
            return al;
        }
    }
}
