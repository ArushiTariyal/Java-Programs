public class LengthOfLastWord {
    public static void main(String[] args){
        System.out.println(lengthOfLastWord(" fly me to the moon "));
    }
    public static int lengthOfLastWord(String s) {
        String ss = s.trim();
        int len = 0;
        for(int i = ss.length()-1; i>=0; i--){
            if(ss.charAt(i)!= ' ') len += 1;
            else break;
        }
        return len;
    }
}
