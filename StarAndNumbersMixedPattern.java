public class StarAndNumbersMixedPattern {
    public static void main(String[] args){
        int n = 5;
        int j;
        for(int i = 1; i<=5;i++){
            for(j = 1; j<= n-i+1; j++){
                System.out.print(j);
            }
            for(int k = 1; k<=2*i-2; k++){
                System.out.print("*");
            }
            for(int m = j-1; m>=1; m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
