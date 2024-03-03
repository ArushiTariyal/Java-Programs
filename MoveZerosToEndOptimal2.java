public class MoveZerosToEndOptimal2 {
    public static void moveZeroes(int[] nums) {
        int j =-1;
        for(int i = 0; i<=nums.length-1; i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i = j+1; i<=nums.length-1; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for(int e: nums) System.out.print(e+" ");
    }

    public static void main(String[] args) {
        int[] a = {3,0,4,30,0,6,5,0,7,5,0,4,0,6,0};
        moveZeroes(a);
    }
}
