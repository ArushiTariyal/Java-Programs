import java.util.Arrays;

public class FractionalKnapsack_GreedyAndComparable {
    class Item implements Comparable<Item>{
        int value, weight;

        Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }

        public int compareTo(Item other){
            double val1 = (double) this.value/this.weight;
            double val2 = (double) other.value/other.weight;

            return Double.compare(val2, val1);
        }
    }
    class Solution {

        public double fractionalKnapsack(int[] val, int[] wt, long cap) {
            // Your code goes here
            Item[] ItemArray = new Item[val.length];
            for(int i = 0; i<val.length; i++){
                ItemArray[i] = new Item(val[i],wt[i]);
            }

            Arrays.sort(ItemArray);

            long currentwt = 0;
            double value = 0;

            for(int i = 0; i<ItemArray.length; i++){
                if(currentwt + ItemArray[i].weight <= cap){
                    currentwt += ItemArray[i].weight;
                    value += ItemArray[i].value;
                }
                else{
                    long rem = cap - currentwt;
                    value += ((double)ItemArray[i].value/ItemArray[i].weight)*rem;
                    break;
                }
            }
            return value;
        }
    }
}
