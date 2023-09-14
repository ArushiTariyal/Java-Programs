public class CheckTwoArraysEqual {
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        checkEqual(a,b);
    }
    public static void checkEqual(int a[], int b[]){
        if(a.length == b.length){
            int i;
            for(i = 0; i<a.length; i++){
                if(a[i] != b[i]){
                    break;
                }
            }
            if(i==a.length){
                System.out.println("Arrays are equal");
            }
            else{
                System.out.println("Arrays are not equal");
            }
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
