import java.util.ArrayList;

public class RearrangeArrayElementsBySignOptimal2 {
    public static int[] alternateNumbers(int []a) {
        int pos = 0;
        int neg = 1;
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int i = 0;
        for( i = 0; i<a.length; i++){
            if(a[i]>=0) positives.add(a[i]);
            else negatives.add(a[i]);
        }
        int j = Math.min(positives.size(),negatives.size());
        for( i = 0; i<j ;i++){
            a[2*i]=positives.get(i);
            a[2*i+1]=negatives.get(i);
        }
        int ind = j*2-1;
        while(j<positives.size()){
            a[ind++]=positives.get(j++);
        }
        while(j<negatives.size()){
            a[ind++] = negatives.get(j++);
        }
        return a;
    }
}
