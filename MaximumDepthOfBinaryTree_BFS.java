import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree_BFS {

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
        public int maxDepth(TreeNode root) {
            if(root==null) return 0;
            Queue<TreeNode> q = new LinkedList<>();

            q.offer(root);
            int count = 0;
            while(!q.isEmpty()){
                int len = q.size();
                for(int i = 1; i<=len; i++){
                    TreeNode node = q.peek();
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                    q.poll();
                }
                count++;
            }
            return count;
        }
    }
}
