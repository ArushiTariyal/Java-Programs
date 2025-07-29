import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack_Greedy_Re {
    class Solution {
        class Item{
            int val;
            int weight;

            public Item(int val, int weight){
                this.val = val;
                this.weight = weight;
            }
        }
        class myComparator implements Comparator<Item>{
            public int compare(Item a, Item b){
                double r1 = (double)a.val/a.weight;
                double r2 = (double)b.val/b.weight;
                if(r1 > r2) return -1;
                else if(r1<r2) return 1;
                return 0;
            }
        }
        public double fractionalKnapsack(int[] val, int[] wt, long cap) {
            // Your code goes here
            Item[] Items = new Item[val.length];
            for(int i = 0; i<val.length; i++){
                Items[i] = new Item(val[i],wt[i]);
            }

            Arrays.sort(Items,new myComparator());

            double total = 0;
            for(Item i: Items){
                if(i.weight<=cap){
                    total += i.val;
                    cap -= i.weight;
                }
                else{
                    total += ((double) i.val/i.weight)*cap;
                    break;
                }
            }
            return total;
        }
    }
}
