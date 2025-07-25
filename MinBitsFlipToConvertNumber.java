public class MinBitsFlipToConvertNumber {
    class Solution {
        public int minBitsFlip(int start, int goal) {
            int num = start ^ goal;
            int count = 0;
            while(num>0){
                num = num & (num-1);
                count++;
            }
            return count;
        }
    }
}
