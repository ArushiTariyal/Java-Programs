public class MissingNumberBrute3 {
    public static void findMissing(int[] nums){
        int[] find = new int[nums.length+1];
        for(int i=0; i<= nums.length-1; i++){
            find[nums[i]] = 1;
        }
        for(int i = 0; i<=find.length-1; i++){
            if(find[i]==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        findMissing(nums);
    }
}
