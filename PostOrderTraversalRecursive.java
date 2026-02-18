import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversalRecursive {
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { data = val; left = null; right = null; }
    }
    class Solution {
        List<Integer> list = new ArrayList<>();

        public List<Integer> postorder(TreeNode root) {
            //your code goes here
            if(root==null) return list;
            postorder(root.left);
            postorder(root.right);
            list.add(root.data);
            return list;
        }
    }
}
