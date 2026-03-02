import java.util.*;

public class ZigZagLevelOrderTraversal {
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
            List<List<Integer>> ans = new ArrayList<>();
            if(root==null) return ans;
            TreeNode node = root;

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(node);

            boolean LRflag = true;

            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> list = new ArrayList<>(Collections.nCopies(size,0));

                for(int i =0; i<size; i++){
                    int ind = (LRflag)? i : size-1-i;
                    node = q.poll();
                    list.set(ind,node.val);
                    if(node.left!=null) q.offer(node.left);
                    if(node.right!=null) q.offer(node.right);

                }
                LRflag = !LRflag;
                ans.add(list);
            }
            return ans;
        }
    }
}
