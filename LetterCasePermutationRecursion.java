public class LetterCasePermutationRecursion {
    public static void permutation(String ip, int i, String op){
        if(i>=ip.length()){
            System.out.println(op);
            return;
        }
        String op1 = op;
        op1 += ip.charAt(i);
        permutation(ip,i+1,op1);
        if(Character.isLetter(ip.charAt(i))){
            String op2 = op;
            op2 += Character.toString(ip.charAt(i)).toUpperCase();
            permutation(ip,i+1,op2);
        }
    }
    public static void main(String[] args) {
        String ip = "a1B2";
        permutation(ip.toLowerCase(),0,"");
    }
}
