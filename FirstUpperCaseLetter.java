public class FirstUpperCaseLetter {
    public static char letter(String s, int i, int l){
        if(i==l) return '-';
        char ch = s.charAt(i);
        if(ch>=65&&ch<=90) return ch;
        return letter(s,i+1,l);
    }
    public static void main(String[] args){
        String s = "gitHub";
        System.out.println(letter(s,0,s.length()));
    }
}
