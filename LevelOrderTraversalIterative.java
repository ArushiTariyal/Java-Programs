import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalIterative {

      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null; }
      }


    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            //your code goes here
            Queue<TreeNode> q = new LinkedList<>();
            List<List<Integer>> ansList = new ArrayList<>();
            if(root==null) return ansList;
            q.offer(root);

            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> innerList = new ArrayList<>();
                for(int i = 1; i<=size; i++){
                    TreeNode node = q.poll();
                    if(node.left!=null) q.offer(node.left);
                    if(node.right!=null) q.offer(node.right);
                    innerList.add(node.data);
                }
                ansList.add(innerList);
            }
            return ansList;
        }
    }
}
