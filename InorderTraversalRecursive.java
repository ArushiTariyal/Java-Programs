import java.util.ArrayList;
import java.util.List;

public class InorderTraversalRecursive {

      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null; }
      }


    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> inorder(TreeNode root) {
            //your code goes here
            if(root==null) return list;
            inorder(root.left);
            list.add(root.data);
            inorder(root.right);
            return list;
        }

    }
}
