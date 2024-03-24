public class PermutationWithSpaces {
    public static void permutations(String ip, int i,String op){
        if(i>=ip.length()){
            System.out.println(op);
            return;
        }
        if(i==0) i++;
        String op1 = op;
        String op2 = op;
        op1 += ip.charAt(i);
        op2 += "_"+ip.charAt(i);
        permutations(ip,i+1,op1);
        permutations(ip,i+1,op2);
    }
    public static void main(String[] args){
        String ip = "ABC";
        String op = Character.toString(ip.charAt(0));
        permutations(ip,0,op);
    }
}
