public class CountTheNumberOfOnes {
    public static void main(String[] args){
        int num = 13;
        int count = 0;
        while(num>0){
            count += num%2;
            num /= 2;
        }
        System.out.println(count);
    }
}
