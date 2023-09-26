public class PyramidTriangleWithNumbers {
    public static void main(String[] args){
        int n = 4;
        for(int i= 1; i<=n; i++){
            for(int k = 1; k<=n-i; k++){
                System.out.print(" ");
            }
            int count = 0;
            for(int j = 1; j<=2*i-1; j++){
                if(j<=i){
                    System.out.print(++count);
                }
                else{
                    System.out.print(--count);
                }
            }
            System.out.println();
        }
    }
}
