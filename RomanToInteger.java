import java.util.Scanner;
public class RomanToInteger {
    public static void main(String[] args){
        System.out.println("Integer value is: "+romanToInt());
    }
    public static int romanToInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a roman numeral: ");
        String s = sc.next();
        int sum = 0;
        int element = 0;
        for(int i =s.length()-1;i>=0; i--){
            switch(s.charAt(i)){
                case 'I' -> element = 1;
                case 'V' -> element = 5;
                case 'X' -> element = 10;
                case 'L' -> element = 50;
                case 'C' -> element = 100;
                case 'D' -> element = 500;
                case 'M' -> element = 1000;
            }
            if(3*element>sum) sum += element;
            else sum -= element;
        }
        return sum;
    }
}
