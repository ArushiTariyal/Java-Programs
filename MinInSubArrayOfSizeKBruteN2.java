public class MinInSubArrayOfSizeKBruteN2 {
    public static void findMin(int[] a, int k){
        for(int i = 0; i<=a.length-k; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i; j<i+k; j++){
                if(min>a[j]) min = a[j];
            }
            System.out.println(min);
        }
    }
    public static void main(String[] args){
        findMin(new int[]{-3,-9,-8,0,8,-16,0},3);
    }
}
