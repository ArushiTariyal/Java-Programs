import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBT {

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


    class Pair{

        TreeNode node;
        int column;

        Pair(TreeNode node, int column){
            this.node = node;
            this.column = column;
        }
    }
    class Solution {
        int diff = 0;
        int last=0;
        int first=0;

        public int widthOfBinaryTree(TreeNode root) {
            if(root==null) return diff;

            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(root,0));

            while(!q.isEmpty()){
                int size = q.size();

                for(int i = 0; i<size; i++){
                    Pair p = q.poll();
                    TreeNode node = p.node;
                    int col = p.column;
                    if(i==0) first = col;
                    if(i==size-1) last = col;

                    if(node.left!=null) q.offer(new Pair(node.left, 2*col));
                    if(node.right!=null) q.offer(new Pair(node.right, 2*col+1));
                }
                diff = Math.max(diff, last-first+1);
            }

            return diff;
        }
    }
}
