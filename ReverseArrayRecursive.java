import java.util.Arrays;

public class ReverseArrayRecursive {
    public static void reverseString(char[] str) {
        rev(str, 0, str.length);
        System.out.println(Arrays.toString(str));
    }
    public static void rev(char[] str, int i, int l){
        if(i==l/2) return;
        char c = str[i];
        str[i] = str[l-i-1];
        str[l-i-1] = c;
        rev(str, i+1, l);
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
