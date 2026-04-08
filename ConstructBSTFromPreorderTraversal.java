public class ConstructBSTFromPreorderTraversal {

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
        public TreeNode bst(int[] pre, int[] i, int ubound){
            if(i[0]==pre.length || pre[i[0]]>ubound) return null;

            TreeNode root = new TreeNode(pre[i[0]]);
            i[0]++;

            root.left = bst(pre, i, root.val);
            root.right = bst(pre, i, ubound);
            return root;
        }
        public TreeNode bstFromPreorder(int[] preorder) {
            return bst(preorder, new int[]{0}, Integer.MAX_VALUE);
        }
    }
}
