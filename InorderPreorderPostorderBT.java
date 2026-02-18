
// import java.util.*;
//   public class TreeNode {
//       int data;
//       TreeNode left;
//      TreeNode right;
//       TreeNode(int val) { data = val; left = null, right = null }
//   }


// class Pair{
// 	TreeNode node;
// 	int num;
// 	Pair(TreeNode node, int num){
// 		this.node = node;
// 		this.num = num;
// 	}
// }
// class Solution {
//     List<List<Integer>> treeTraversal(TreeNode root) {
//         //your code goes here
// 		Stack<Pair> st = new Stack<>();
// 		List<Integer> pre = new ArrayList<>();
// 		List<Integer> inord = new ArrayList<>();
// 		List<Integer> post = new ArrayList<>();
// 		List<List<Integer>> ans = new ArrayList<>();

// 		st.push(new Pair(root,1));

// 		while(!st.isEmpty()){
// 			Pair nodepair = st.pop();
			

// 			if(nodepair.num==1){
// 				pre.add(nodepair.node.data); 
// 				nodepair.num++;
// 				st.push(nodepair);
// 				if(nodepair.node.left!=null) st.push(new Pair(nodepair.node.left, 1));
// 			}
// 			else if(nodepair.num==2){
// 				inord.add(nodepair.node.data); 
// 				nodepair.num++;
// 				st.push(nodepair);

// 				if(nodepair.node.right!=null) st.push(new Pair(nodepair.node.right,1));
// 			}
// 			else{
// 				post.add(nodepair.node.data);
// 			}
// 		}

		
// 		ans.add(inord);
// 		ans.add(pre);
// 		ans.add(post);

// 		return ans;


//     }
// }