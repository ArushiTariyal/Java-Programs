
class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int[] hash = new int[256];
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        int l = 0;
        int count = 0;
        for(int i = 0; i<t.length(); i++){
            hash[t.charAt(i)]++;
        }
       for(int r = 0; r<s.length(); r++){
        if(hash[s.charAt(r)]>0) count++;
        hash[s.charAt(r)]--;

        
        while(count==t.length()){
            if (count==t.length()){
                if(minlen>r-l+1){
                    minlen = r-l+1;
                    start = l;
                }
            }
            hash[s.charAt(l)]++;
            if(hash[s.charAt(l)]>0){
                count--;
            }
            l++;
        }

        
       }
       if(minlen==Integer.MAX_VALUE) return "";
       return s.substring(start, start+minlen);
    }
}