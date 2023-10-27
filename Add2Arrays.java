import java.util.Arrays;

public class Add2Arrays {
    public static int[] add(int[] a, int[] b){
        int i = a.length-1;
        int j =  b.length-1;
        int sum;
        int carry = 0;
        int[] ans = new int[Math.max(a.length,b.length)+1];
        int index = 0;
        while(i>=0 && j>=0){
            sum = a[i]+b[j]+carry;
            carry = sum/10;
            sum %= 10;
            ans[index++] = sum;
            i--;
            j--;
        }
        while(i>=0){
            sum = a[i--]+carry;
            carry = sum/10;
            sum %= 10;
            ans[index++] = sum;
        }
        while(j>=0){
            sum = b[j--]+carry;
            carry = sum/10;
            sum %= 10;
            ans[index++] = sum;
        }
        if(carry!=0) {
            ans[index] = carry;
            return ans;
        }

        return Arrays.copyOfRange(ans,0,ans.length-1);
    }
    public static void print(int[] add){
        int j = add.length-1;
        for(int i = 0; i<add.length/2; i++,j--){
            int temp = add[i];
            add[i] = add[j];
            add[j] = temp;
        }
        for(int n : add){
            System.out.print(n);
        }
        System.out.println();
    }
    public static void main(String[] args){
        print(add(new int[] {9,9,9}, new int[]{1}));
        print(add(new int[] {1,2,3}, new int[]{4,5,6}));
        print(add(new int[] {7,3}, new int[]{4,9,6}));
        print(add(new int[] {3,6,4,8,9}, new int[]{8,9,4,2}));
    }
}
