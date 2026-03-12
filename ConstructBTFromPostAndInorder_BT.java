import java.util.HashMap;
import java.util.Map;

public class ConstructBTFromPostAndInorder_BT {

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
        Map<Integer,Integer> map = new  HashMap<>();
        public TreeNode build(int[] post, int psS, int psE, int[] in, int inS, int inE, Map<Integer,Integer> map){

            if(psS<psE || inS>inE) return null;

            TreeNode root = new TreeNode(post[psS]);
            int index = map.get(post[psS]);
            int rem = inE - index;

            root.right = build(post,psS-1,psS-rem, in,index+1,inE,map);
            root.left = build(post,psS-rem-1,psE,in,inS,index-1,map);


            return root;
        }
        public TreeNode buildTree(int[] inorder, int[] postorder) {

            for(int i = 0; i<inorder.length; i++){
                map.put(inorder[i],i);
            }
            return build(postorder,postorder.length-1,0,inorder,0,inorder.length-1,map);
        }
    }
}
