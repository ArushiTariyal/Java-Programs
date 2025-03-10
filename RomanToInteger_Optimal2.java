public class RomanToInteger_Optimal2 {
    class Solution {
        public int getVal(char ch){
            switch(ch){
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }
        public int romanToInt(String s) {
            int sum = 0;
            for(int i = 0; i<s.length(); i++){
                if(i<s.length()-1 && getVal(s.charAt(i))< getVal(s.charAt(i+1))){

                    sum -= getVal(s.charAt(i));


                }
                else sum+= getVal(s.charAt(i));
            }
            return sum;
        }
    }
}
