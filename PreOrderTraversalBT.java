import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalBT {
      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null;}
      }


    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> preorder(TreeNode root) {
            //your code goes here
            if(root==null) return list;
            list.add(root.data);
            preorder(root.left);
            preorder(root.right);
            return list;
        }
    }
}
