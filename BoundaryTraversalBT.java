import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversalBT {

      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null; }
      }


    class Solution {
        List<Integer> ansList = new ArrayList<>();

        public List<Integer> leftBoundary(TreeNode node){
            if(node==null) return ansList;
            if(node.left==null && node.right==null) return ansList;

            ansList.add(node.data);
            leftBoundary(node.left);
            if(node.left==null) leftBoundary(node.right);
            return ansList;
        }

        public List<Integer> bottomBoundary(TreeNode node){
            if(node==null) return ansList;
            if(node.left==null && node.right==null){
                ansList.add(node.data);
                return ansList;
            }
            bottomBoundary(node.left);
            bottomBoundary(node.right);
            return ansList;

        }

        public List<Integer> rightBoundary(TreeNode node, TreeNode root){
            if(node==null) return ansList;
            if(node.right==null && node.left==null) return ansList;

            if(node.right!=null) rightBoundary(node.right, root);
            else rightBoundary(node.left, root);

            if(node!=root) ansList.add(node.data);
            return ansList;
        }


        public List<Integer> boundary(TreeNode root) {
            //your code goes here
            TreeNode node = root;
            leftBoundary(node);
            bottomBoundary(node);
            rightBoundary(node, root);
            return ansList;
        }
    }
}
