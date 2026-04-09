public class BST_Iterator_UsingMorrisInorderTraversal {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;         this.right = right;
          }
      }

    class BSTIterator {
        TreeNode curr = new TreeNode();
        public BSTIterator(TreeNode root) {
            this.curr = root;
        }
        public TreeNode findPred(TreeNode curr){
            TreeNode mover = curr.left;
            while(mover.right!=null && mover.right!=curr){
                mover = mover.right;
            }
            return mover;

        }

        public int next() {
            int ans = -1;
            while(true){
                if(curr.left==null){
                    ans = curr.val;
                    curr = curr.right;
                    return ans;
                }
                else{
                    TreeNode IP = findPred(curr);
                    if(IP.right==null){
                        IP.right = curr;
                        curr = curr.left;
                    }
                    else{
                        ans = curr.val;
                        IP.right = null;
                        curr = curr.right;
                        return ans;
                    }
                }
            }
        }

        public boolean hasNext() {
            return curr!=null;
        }
    }

}
