public class SingleNumberBrute {
    public static int singleNum(int[] a){
        for(int i = 0; i<=a.length-1; i++){
            int count = 0;
            for(int j = 0; j<=a.length-1; j++){
                if(a[j]==a[i]) count++;
            }
            if(count==1){
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNum(new int[]{1,5,3,4,5,3,1,4,2}));
    }
}
