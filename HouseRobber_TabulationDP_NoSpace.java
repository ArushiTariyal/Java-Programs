public class HouseRobber_TabulationDP_NoSpace {
    class Solution {
        public int houseRobDP(int[] money){
            int first = money[0];
            int second = 0;
            for(int ind = 1; ind<money.length; ind++){
                int take = money[ind];
                if(ind-2>=0) {
                    take = money[ind] + second;
                }

                int notTake = 0 + first;

                int curr = Math.max(take, notTake);
                second = first;
                first = curr;

            }
            return first;
        }
        public int houseRobber(int[] money) {

            if(money.length==1) return money[0];

            int[] arr1 = new int[money.length-1];
            int[] arr2 = new int[money.length-1];

            int j = 0, k = 0;

            for(int i = 0; i<money.length; i++){
                if(i!=money.length-1) arr1[j++] = money[i];
                if(i!=0) arr2[k++] = money[i];
            }

            int val1 = houseRobDP(arr1);
            int val2 = houseRobDP(arr2);
            return Math.max(val1, val2);
        }
    }
}
