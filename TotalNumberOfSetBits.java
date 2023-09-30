public class TotalNumberOfSetBits {
    public static void main(String[] args){
        System.out.printf("Number of set bits is %d",setBit(2)+setBit(3));
    }
    public static int setBit(int num){
        int setBits = 0;
        while(num!=0){
            int dig = num%2;
            if(dig ==1) setBits++;
            num /=2;
        }
        return setBits;
    }
}
