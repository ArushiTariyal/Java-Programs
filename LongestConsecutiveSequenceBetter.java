

import java.util.*;

public class LongestConsecutiveSequenceBetter {
    public static void longestConsecutiveSequence(int[] arr){
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> sequence = new ArrayList<>();
        for(int j = 0; j<=arr.length-1; j++){
                if(ans.size()==0 || arr[j]==ans.get(ans.size()-1)+1){
                    ans.add(arr[j]);
                }
                else{
                    sequence.add(new ArrayList<>(ans));
                    ans = new ArrayList<>();
                    ans.add(arr[j]);
                }
        }
        sequence.add(ans);
        int longest = 0;
        for(int i=0; i<=sequence.size()-1; i++){
            if(sequence.get(i).size()>sequence.get(longest).size()) longest = i;
        }
        System.out.println(sequence.get(longest));
    }
    public static void main(String[] args){
        int[] arr = {5,8,9,10,11,12,13,14,15, 3, 2, 1, 4};
        Arrays.sort(arr);
        longestConsecutiveSequence(arr);
    }
}

