import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root==null) return new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            List<List<Integer>> wrapper = new ArrayList<>();
            while(!queue.isEmpty()){
                int lim = queue.size();
                List<Integer> sublist = new ArrayList<>();
                for(int i = 1; i<=lim; i++){
                    if(queue.peek().left!=null) queue.add(queue.peek().left);
                    if(queue.peek().right!=null) queue.add(queue.peek().right);
                    sublist.add(queue.poll().val);
                }
                wrapper.add(new ArrayList<>(sublist));
            }
            return wrapper;
        }
    }
}
