import java.util.*;
public class ThreeSum_Better {
    public class Solution {
        public static List< List < Integer > > triplet(int n, int []arr) {
            // Write your code here.
            HashSet<Integer> set = new HashSet<>();
            HashSet<List> ans = new HashSet<>();
            List<List<Integer>> al = new ArrayList<>();
            for(int i = 0; i<n; i++){
                for(int j = i+1; j<n; j++){
                    int third = -(arr[i]+arr[j]);
                    if(set.contains(third)){
                        List<Integer> l = new ArrayList<>();
                        l.add(arr[i]);
                        l.add(arr[j]);
                        l.add(third);
                        Collections.sort(l);
                        if(!ans.contains(l)){
                            ans.add(l);
                            al.add(l);
                        }
                    }

                    set.add(arr[j]);
                }
                set.clear();
            }

            // for(List it: ans){
            //     al.add(it);
            // }
            return al;
        }
    }
}
