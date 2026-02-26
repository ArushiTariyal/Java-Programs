public class MaximumPathSumBT {
   public class TreeNode { int val;TreeNode left;
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
        int maxPath = Integer.MIN_VALUE;
        public int findPathMax(TreeNode node){
            if(node==null) return 0;
            int left = findPathMax(node.left);
            if(left<0) left=0;
            int right = findPathMax(node.right);
            if(right<0) right = 0;

            maxPath = Math.max(maxPath, left+right+node.val);

            return node.val + Math.max(left,right);
        }
        public int maxPathSum(TreeNode root) {
            findPathMax(root);
            return maxPath;
        }
    }
}
