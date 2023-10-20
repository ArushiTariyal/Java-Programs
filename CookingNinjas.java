public class CookingNinjas {
    public static int minTime(int[] rank, int dishes){
        int s = 0,e=0;
        int maxRank = Integer.MIN_VALUE;
        for(int i : rank) maxRank = Math.max(maxRank,i);
        for(int i = 1; i<=dishes; i++){
            e += maxRank*i;
        }
        int ans = 0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(rank, dishes, mid)){
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
    public static boolean isPossible(int[] rank, int dishes, int mid){
        int preparedDishes = 0;
        for(int i = 0; i<rank.length; i++){
            int units = 1;
            int timeTaken = 0;
            while(rank[i]*units +timeTaken<=mid){
                timeTaken = timeTaken + rank[i]*units;
                units++;
                preparedDishes++;
                if(preparedDishes==dishes) return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(minTime(new int[] {1,2,3,4},11));
        System.out.println(minTime(new int[] {1,1,1,1,1,1,1,1},8));
    }
}
