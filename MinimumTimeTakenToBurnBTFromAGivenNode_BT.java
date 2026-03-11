import java.util.*;

public class MinimumTimeTakenToBurnBTFromAGivenNode_BT {

      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null; }
      }


    class Solution {
        Map<TreeNode,TreeNode> parentTrack = new HashMap<>();
        public void findParent(TreeNode root){
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            while(!q.isEmpty()){
                TreeNode n = q.poll();
                if(n.left!=null){
                    q.offer(n.left);
                    parentTrack.put(n.left,n);
                }

                if(n.right!=null){
                    q.offer(n.right);
                    parentTrack.put(n.right,n);
                }

            }
        }
        public int timeToBurnTree(TreeNode root, int start) {
            //your code goes here
            if(root==null) return 0;
            findParent(root);
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            TreeNode startNode = null;
            while(!q.isEmpty()){
                TreeNode n = q.poll();
                if(n.data==start){
                    startNode = n;
                    break;
                }
                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);

                }
            }

            Set<TreeNode> visited = new HashSet<>();

            Queue<TreeNode> nodes = new LinkedList<>();

            nodes.offer(startNode);

            int count = 0;

            while(!nodes.isEmpty()){
                int size = nodes.size();

                for(int i = 0; i<size; i++){
                    TreeNode n = nodes.poll();
                    visited.add(n);

                    if(n.left!=null && !visited.contains(n.left)){
                        nodes.offer(n.left);
                        visited.add(n.left);
                    }
                    if(n.right!=null && !visited.contains(n.right)){
                        nodes.offer(n.right);
                        visited.add(n.right);
                    }
                    if(parentTrack.containsKey(n) && !visited.contains(parentTrack.get(n))){
                        nodes.offer(parentTrack.get(n));
                        visited.add(parentTrack.get(n));
                    }
                }
                count++;

            }

            return count-1;


        }
    }
}
