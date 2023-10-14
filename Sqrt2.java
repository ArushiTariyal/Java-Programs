public class Sqrt2 {
    public static void main(String[] args){
        System.out.println(sqr(89));
        System.out.println(sqr(25));
    }
    public static int sqr(int num){
        if(num==0|| num==1) return num;
        int s =2, e=num/2;
        int mid;
        while(s<=e){
            mid = s+(e-s)/2;
            long sq = (long) mid*mid;
            if(sq>num) e = mid-1;
            else s = mid+1;
        }
        return e;
    }
}
