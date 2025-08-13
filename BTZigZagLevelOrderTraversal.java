import java.util.*;

public class BTZigZagLevelOrderTraversal {

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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if(root==null) return new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            List<List<Integer>> ans = new ArrayList<>();

            q.offer(root);

            boolean lefttoright = true;

            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> sub = new ArrayList<>(Collections.nCopies(size,0));
                for(int i = 0; i<size; i++){
                    TreeNode node = q.poll();
                    if(node.left!=null) q.offer(node.left);
                    if(node.right!=null) q.offer(node.right);
                    int ind = lefttoright ? i: size-i-1;
                    sub.set(ind,node.val);
                }
                lefttoright = !lefttoright;
                ans.add(sub);
            }
            return ans;
        }
    }
}
