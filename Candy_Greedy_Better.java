public class Candy_Greedy_Better {
    class Solution {
        public int candy(int[] ratings) {
            int[] left = new int[ratings.length];
            int[] right = new int[ratings.length];

            int candy = 1;

            left[0] = 1;
            for(int i = 1; i<ratings.length; i++){
                if(ratings[i]>ratings[i-1]){
                    candy++;
                }
                else candy = 1;
                left[i] = candy;
            }

            candy = 1;

            right[ratings.length-1] = 1;
            for(int i = ratings.length-2; i>=0; i--){
                if(ratings[i]>ratings[i+1]){
                    candy++;
                }
                else candy = 1;
                left[i] = Math.max(left[i],candy);
            }

            int totalCandy = 0;

            for(int i = 0; i<ratings.length; i++){
                totalCandy += left[i];
            }

            return totalCandy;
        }
    }
}
