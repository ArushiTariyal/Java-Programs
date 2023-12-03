public class SwapFirstLastDigitOfNumber {
    public static void main(String[] args){
        int num = 4563632;
        int l = num%10;
        int n = num;
        int count = 0;
        while(n>9){
            count++;
            n /= 10;
        }
        int newNum = l*(int)Math.pow(10,count) + (num/10%(int)Math.pow(10,--count))*10 + n;
        System.out.println(newNum);
    }
}
