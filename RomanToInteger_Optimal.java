public class RomanToInteger_Optimal {
    class Solution {
        public int romanToInt(String s) {
            int val = 0;
            int sum = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)=='I') val = 1;
                else if(s.charAt(i)=='V') val = 5;
                else if(s.charAt(i)=='X') val = 10;
                else if(s.charAt(i)=='L') val = 50;
                else if(s.charAt(i)=='C') val = 100;
                else if(s.charAt(i)=='D') val = 500;
                else if(s.charAt(i)=='M') val = 1000;

                if(i<s.length()-1){
                    if(s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')) val=-1;
                    else if(s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')) val=-10;
                    else if(s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')) val=-100;
                }

                sum += val;
            }
            return sum;
        }
    }
}
