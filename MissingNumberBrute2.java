public class MissingNumberBrute2 {
    public static void missingNum(int[] a){
        for(int i = 0; i<=a.length; i++){
            int count = 0;
            for(int j = 0; j<=a.length-1; j++){
                if(i != a[j]) count++;
                else break;
            }
            if(count==a.length){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        missingNum(nums);
    }
}
