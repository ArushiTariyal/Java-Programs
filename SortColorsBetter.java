public class SortColorsBetter {
        public void sortColors(int[] nums) {
            int count0 = 0, count1 = 0, count2 = 0;
            for(int i = 0; i<=nums.length-1; i++){
                if(nums[i]==0) count0++;
                else if(nums[i]==1) count1++;
                else count2++;
            }
            int x,y,z;
            for(x = 0; x<count0; x++){
                nums[x] = 0;
            }
            for(y = x; y<x+count1; y++){
                nums[y] = 1;
            }
            for(z=y; z<y+count2; z++){
                nums[z] = 2;
            }
        }

}
