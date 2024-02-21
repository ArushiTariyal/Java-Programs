public class KthGrammarUsingMid {
    public static int kthGrammar2(int N, int K){
        if(N==1 && K==1) return 0;
        int mid = (int)Math.pow(2,N-2);
        if(K>mid*2) return -1;
        if(K<=mid) return kthGrammar2(N-1,K);
        return 1^kthGrammar2(N-1,K-mid);
    }
    public static void main(String[] args) {
        System.out.println(kthGrammar2(4,5));
    }
}
