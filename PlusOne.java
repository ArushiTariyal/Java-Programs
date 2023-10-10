import java.util.Arrays;

public class PlusOne {
      static class Solution {
        public static int[] plusOne(int[] digits) {
            int i = digits.length-1;
            while(i>=0){
                if(digits[i]<9){
                    digits[i]++;
                    return digits;
                }
                digits[i--] = 0;
            }
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            return arr;
        }
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(PlusOne.Solution.plusOne(new int[] {1,2,3})));
        System.out.println(Arrays.toString(PlusOne.Solution.plusOne(new int[] {9,9,9})));
        System.out.println(Arrays.toString(PlusOne.Solution.plusOne(new int[] {6,8,9})));
    }
}
