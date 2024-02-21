public class TowerOfHanoiRecursion {
    static int c = 0;
    public static void toh(int n, int s, int h, int d){
        if(n==0) {
            return;
        }
        c +=1;
        if(n==1) {
            System.out.println("Disk "+n+" moved from "+s+" to "+d);
            //c +=1;
            return;
        }
        toh(n-1,s,d,h);
        System.out.println("Disk "+n+" moved from "+s+" to "+d);
        //c +=1;
        toh(n-1,h,s,d);

    }
    public static void main(String[] args){

       toh(0,1,2,3);
        System.out.println(c);
    }
}
