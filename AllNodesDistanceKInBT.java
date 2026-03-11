import java.util.*;

public class AllNodesDistanceKInBT {

      public class TreeNode {
          int val;
         TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            Map<TreeNode, TreeNode> parent = new HashMap<>();
            Queue<TreeNode> q = new LinkedList<>();

            q.offer(root);
            while(!q.isEmpty()){
                TreeNode n = q.poll();
                if(n.left!=null){
                    parent.put(n.left,n);
                    q.offer(n.left);
                }

                if(n.right!=null){
                    parent.put(n.right,n);
                    q.offer(n.right);

                }
            }

            Set<TreeNode> l = new HashSet<>();
            q.offer(target);
            int count = 0;
            while(!q.isEmpty()){
                if(count==k) break;
                int size = q.size();

                for(int i = 0; i<size; i++){
                    TreeNode n = q.poll();
                    l.add(n);
                    if(n.left!=null){
                        if(!l.contains(n.left)){
                            q.offer(n.left);
                            l.add(n.left);
                        }
                    }

                    if(n.right!=null && !l.contains(n.right)){
                        q.offer(n.right);
                        l.add(n.right);
                    }

                    if(parent.containsKey(n) && !l.contains(parent.get(n))){
                        q.offer(parent.get(n));
                        l.add(parent.get(n));
                    }


                }
                count++;

            }

            List<Integer> ans = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i<size; i++){
                ans.add(q.poll().val);
            }
            return ans;

        }
    }
}
