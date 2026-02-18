//public class PostOrderTraversalIterative {
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int data;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode(int val) { data = val; left = null, right = null }
//     * }
//     **/
//
//    class Solution {
//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> st = new Stack<>();
//        public List<Integer> postorder(TreeNode root) {
//            //your code goes here
//            st.push(root);
//            while(!st.isEmpty()){
//                TreeNode node = st.pop();
//                list.add(node.data);
//                if(node.left!=null){
//
//                    st.push(node.left);
//                }
//                if(node.right!=null){
//                    st.push(node.right);
//                }
//            }
//            Collections.reverse(list);
//            return list;
//        }
//    }
//}
