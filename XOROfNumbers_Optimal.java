public class XOROfNumbers_Optimal {
    public static void main(String[] args) {
        int n = 12;
        if (n%4 == 1) System.out.println(1);
        else if(n%4==2) System.out.println(n+1);
        else if(n%4==3) System.out.println(0);
        else System.out.println(n);
    }
}
