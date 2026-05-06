public class LemonadeChange_Greedy {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int fives = 0;
            int tens = 0;

            for(int i = 0; i<bills.length; i++){
                int deno = bills[i];

                if(deno == 10){
                    if(fives>0){
                        fives--;
                        tens++;
                    }
                    else return false;
                }

                else if(deno==5) fives++;

                else{
                    if(tens>0 && fives>=1){
                        tens--;
                        fives--;
                    }
                    else if(fives>=3){
                        fives -= 3;
                    }
                    else return false;
                }

            }
            return true;
        }
    }
}
