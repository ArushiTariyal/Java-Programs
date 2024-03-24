public class PermutationsWithSpaces2 {
    public static void permutations(String ip, int i, String op){
        if(i>=ip.length()){
            System.out.println(op);
            return;
        }
        permutations(ip,i+1,op+"_"+ip.charAt(i));
        permutations(ip,i+1,op+ip.charAt(i));
    }
    public static void main(String[] args) {
        String ip = "ABC";
        permutations(ip,1,Character.toString(ip.charAt(0)));
    }
}
