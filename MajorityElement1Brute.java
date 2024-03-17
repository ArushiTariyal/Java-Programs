public class MajorityElement1Brute {
    public static int majorityElement(int[] arr){
        int count = 0;
        for(int i = 0; i<=arr.length-1; i++){
            for(int j = 0; j<=arr.length-1; j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count>arr.length/2) return arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(majorityElement(new int[]{3,5,3,3,3,3,6,7,7}));
    }
}
