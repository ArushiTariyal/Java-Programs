import java.util.ArrayList;
import java.util.List;

public class PrintRootToLeafPathInBT {

      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null; }
      }

    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        public List<Integer> rootToLeaf(TreeNode node, List<Integer> list){
            if(node==null) return list;
            list.add(node.data);

            if(node.left==null && node.right==null){
                ans.add(new ArrayList<>(list));
            }

            rootToLeaf(node.left,list);
            rootToLeaf(node.right, list);
            list.remove(list.size()-1);
            return list;
            
        }
        public List<List<Integer>> allRootToLeaf(TreeNode root) {
            //your code goes here
            rootToLeaf(root,list);
            return ans;
        }
    }
}
