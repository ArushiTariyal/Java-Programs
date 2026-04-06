import java.util.ArrayList;
import java.util.List;

public class FindCeilAndFloorInBT {

      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null ;}
      }

    class Solution {
        public List<Integer> floorCeilOfBST(TreeNode root, int key) {
            //your code goes here
            List<Integer> list = new ArrayList<>();
            TreeNode root1 = root;
            TreeNode root2 = root;
            int val = -1;
            int val2 = -1;

            while(root1!=null){
                if(root1.data==key){
                    val = root1.data;
                    break;
                }
                if(root1.data<key){
                    val = root1.data;
                    root1 = root1.right;
                }
                else{
                    root1 = root1.left;
                }
            }
            list.add(val);

            while(root2!=null){
                if(root2.data==key){
                    val2 = root2.data;
                    break;
                }
                if(root2.data>key){
                    val2 = root2.data;
                    root2 = root2.left;
                }
                else{
                    root2 = root2.right;
                }
            }
            list.add(val2);
            return list;
        }
    }
}
