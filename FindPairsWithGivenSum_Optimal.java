import java.util.ArrayList;
import java.util.Arrays;

public class FindPairsWithGivenSum_Optimal {
    class Node
    {
        int data;
        Node next,prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }


    class Solution {
        public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
            // code here

            ArrayList<ArrayList<Integer>> al = new ArrayList<>();
            Node first = head;
            Node last = head;
            while(last.next!=null){
                last = last.next;
            }
            while(first!=last && first.prev!=last){
                int sum = last.data + first.data;
                if(sum==target){
                    al.add(new ArrayList<>(Arrays.asList(first.data,last.data)));
                    first = first.next;
                    last = last.prev;

                }
                else if(sum>target) last = last.prev;
                else first = first.next;
            }
            return al;
        }
    }


}
