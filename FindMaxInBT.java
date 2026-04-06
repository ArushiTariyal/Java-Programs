public class FindMaxInBT {

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
            public TreeNode searchMaxBST(TreeNode root) {
                if(root.left!=null) return searchMaxBST(root.left);
                return root;
            }
        }


}
