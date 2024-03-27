public class LetterCasePermutation2 {
    public static void permutation(String ip, int i, String op){
        if(i>=ip.length()){
            System.out.println(op);
            return;
        }
        permutation(ip,i+1,op+ip.charAt(i));
        if(Character.isLetter(ip.charAt(i))){
            permutation(ip,i+1,op+Character.toString(ip.charAt(i)).toUpperCase());
        }
    }
    public static void main(String[] args) {
        String ip = "a1B2";
        permutation(ip.toLowerCase(),0,"");
    }
}

