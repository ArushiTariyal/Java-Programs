public class CountTheNumberOfOnes_Better {
    public static void main(String[] args){
        int num = 13;
        int count = 0;
        while(num>0){
            count += num&1;
            num = num>>1;
        }
        System.out.println(count);
    }
}
