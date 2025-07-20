import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Item{
    int weight;
    int value;
    public Item(int value, int weight){
        this.weight = weight;
        this.value = value;
    }
}

class compareItems implements Comparator<Item>{
    public int compare(Item a, Item b){
        if(a.value/(1.0*a.weight) >= b.value/(1.0*b.weight)) return 1;
        return -1;
    }
}

public class FractionalKnapsack {
    public double greedyWeight(Item[] Items, int w){
        double totalVal = 0.0;
        Arrays.sort(Items, new compareItems());

        int i = 0;
        while(i<Items.length){
            if(Items[i].weight <= w){
                totalVal += Items[i].value;
                w -= Items[i].weight;
            }
            else{
                totalVal += ((double)Items[i].value/Items[i].weight)*w;
                break;
            }
            i++;
        }
        return totalVal;
    }
    public static void main(String[] args){
        Item[] Items = {new Item(100,5), new Item(200,3), new Item(90,9)};
    }
}
