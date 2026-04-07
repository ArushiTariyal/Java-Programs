public class FindKthSmallestInBST_Inorder {

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
        int count = 0;
        int value = -1;
        public void traversal(TreeNode root, int k){
            if(root==null) return;
            traversal(root.left,k);
            count++;
            if(count==k){
                value = root.val;
                return;
            }
            traversal(root.right,k);
        }
        public int kthSmallest(TreeNode root, int k) {
            traversal(root,k);
            return value;
        }
    }
}
