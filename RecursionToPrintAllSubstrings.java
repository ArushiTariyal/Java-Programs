public class RecursionToPrintAllSubstrings {
    public static void substring(String s, int l){

        if(l==0||l==1) {
            System.out.println(s.substring(0,l));
            return;
        }

        substring(s,l-1);
        lastSubStr(s,l);
        System.out.println(s.substring(0,l));
    }
    public static void lastSubStr(String s, int k){

        if(k==0) return;
        if(k==1) {
            System.out.println(s.charAt(k));
            return;
        }
        char z = s.charAt(k-1);
        lastSubStr(s,k-1);
        if(s.indexOf(s.charAt(k-1))+1 == s.indexOf(z)){
            System.out.println(s.substring(0,s.indexOf(z)));
            return;
        }
        System.out.println(s);
    }
    public static void attach(String s, int m, char z, int ind){
        if(m==0){
            s = s+ z;
            return;
        }
        if(s.indexOf(s.charAt(m-1))+1 != ind) return;
        char h = s.charAt(m-1);
        attach(s,m-1,z,ind);
        insert(s,m-1,h);
    }
    public static void insert(String s, int k, char h){
        if(k==0) {
            s = s+h;
            return;
        }
        int p = s.charAt(k-1);
        insert(s,k-1,h);
        s = s+p;
    }
    public static void main(String[] args) {
        String s = "abc";
        substring(s,s.length() );
    }
}
