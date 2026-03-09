import java.util.LinkedList;
import java.util.Queue;

public class ChildrenSumInBT {
    class TreeNode {
     int val;
     TreeNode left, right;
     TreeNode(int x) { val = x; }
 }

    class Solution {
        boolean checkChildrenSum(TreeNode root) {
            if(root==null) return true;
            Queue<TreeNode> q  = new LinkedList<>();
            q.offer(root);
            int leftval = 0, rightval = 0;

            while(!q.isEmpty()){
                TreeNode node = q.poll();
                if(node.left==null && node.right==null) continue;

                if(node.left==null){
                    leftval = 0;
                }
                else{
                    leftval = node.left.val;
                    q.offer(node.left);
                }

                if(node.right==null){
                    rightval = 0;
                }
                else{
                    rightval = node.right.val;
                    q.offer(node.right);
                }

                if(leftval + rightval != node.val) return false;
            }
            return true;
        }
    }

}
