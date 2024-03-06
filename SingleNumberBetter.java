public class SingleNumberBetter {
    public static int singleNum(int[] a){
        int max = a[0];
        for(int e: a){
            if(e>max) e = max;
        }
        int[] hash = new int[max+1];
        for(int i = 0; i<=a.length-1; i++){
            hash[a[i]] += 1;
        }
        for(int i = 0; i<=a.length-1; i++){
            if(hash[a[i]]==1) return a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNum(new int[]{4,2,3,4,1,2,1}));
    }
}
