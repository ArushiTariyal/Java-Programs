public class FindNumberAppearingOnce {
    public static int find(int[] a){
        int element = 0;
        for(int e: a) element ^= e;
        return element;
    }
    public static void main(String[] args) {
        System.out.println(find(new int[]{1,2,3,3,2,1,4,5,4}));
    }
}
