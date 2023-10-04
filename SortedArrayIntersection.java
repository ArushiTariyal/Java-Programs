import java.util.Vector;

class SortedArray{
    public static Vector intersection(int[] a, int[] b){
        Vector<Integer> v = new Vector<>();
//        int newStart=0;
//        for(int i = 0; i<a.length; i++){
//            for(int j = newStart; j<b.length; j++){
//
//                if(a[i]==b[j]){
//                    v.add(a[i]);
//                    newStart =j+1;
//                    break;
//                }
//                else if (a[i]<b[j]) break;
//            }
//        }
//        return v;

        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) j++;
            else if(a[i]<b[j]) i++;
            else{
                v.add(a[i]);
                i++;
                j++;
            }
        }
        return v;
    }
}
public class SortedArrayIntersection {
    public static void main(String[] args){
        System.out.println(SortedArray.intersection(new int[] {1,2,2,3,4}, new int[] {0,1,2,2,4,5}));
        System.out.println(SortedArray.intersection(new int[] {5,6,7,7,7}, new int[] {2,3,7,7}));
    }
}
