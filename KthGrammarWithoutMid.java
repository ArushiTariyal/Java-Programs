public class KthGrammarWithoutMid {
    public static int kthGrammar(int N,int K){
        if(N==1 && K==1) return 0;
        if(K>(int)Math.pow(2,N-1)) return -1;
        if(K%2 != 0) return kthGrammar(N-1, K/2+1);
        return 1^kthGrammar(N-1,K/2);
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(4,5));

    }
}
