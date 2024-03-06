public class MissingNumberBrute1 {
        public static int missingNumber(int[] nums) {
            quicksort(nums,0,nums.length-1);
            return missingNum(nums);
        }
        public static void quicksort(int[] nums, int l, int h){
            if(l<h){
                int piv = partition(nums, l, h);
                quicksort(nums, l, piv - 1);
                quicksort(nums, piv + 1, h);
            }
        }
        public static int partition(int[] nums, int l, int h){
            int p = l;
            int i = l;
            int j = h;
            while(i<j){
                while(nums[i]<=nums[p] && i<=h-1) i++;
                while(nums[j]>nums[p] && j>=l+1) j--;
                if(i<j){
                    int t = nums[j];
                    nums[j] = nums[i];
                    nums[i] = t;
                }
            }
            int t = nums[j];
            nums[j] = nums[p];
            nums[p] = t;
            return j;

        }
        public static int missingNum(int[] nums){
            int i=1;
            for(i = 1; i<=nums.length-1; i++){
                if(nums[i-1] != nums[i]-1) return nums[i]-1;
            }
            return nums[i-1]+1;
        }

        public static void main(String[] args) {
            int[] nums = {9,6,4,2,3,5,7,0,1};
            System.out.println(missingNumber(nums));
            for(int e: nums) System.out.print(e+" ");
        }
}

