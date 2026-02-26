public class DiameterOfBT {


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
        int diam = 0;
        public int finddiam(TreeNode root){
            if(root==null) return 0;

            int leftht = finddiam(root.left);
            int rightht = finddiam(root.right);

            diam = Math.max(diam,leftht+rightht);

            return 1 + Math.max(leftht,rightht);
        }
        public int diameterOfBinaryTree(TreeNode root) {
            finddiam(root);
            return diam;
        }
    }
}
