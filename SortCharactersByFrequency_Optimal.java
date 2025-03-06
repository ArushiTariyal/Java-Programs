import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
public class SortCharactersByFrequency_Optimal {
    class Solution {
        class Pair{
            char ch;
            int count;
            Pair(char ch, int count){
                this.ch = ch;
                this.count = count;
            }
        }
        public String frequencySort(String s) {
            int[] arr = new int[125];
            for(char ch: s.toCharArray()){
                arr[ch]++;
            }

            ArrayList<Pair> al = new ArrayList<>();

            for(int i = 48; i<=122; i++){
                if(arr[i]>0){
                    al.add(new Pair((char)i, arr[i]));
                }
            }

            Collections.sort(al, new Comparator<Pair>(){
                public int compare(Pair a, Pair b){
                    return b.count - a.count;
                }
            });

            StringBuilder sb = new StringBuilder();
            for(Pair p: al){
                int count = p.count;
                while(count-->0){
                    sb.append(p.ch);
                }
            }
            return sb.toString();
        }
    }
}
