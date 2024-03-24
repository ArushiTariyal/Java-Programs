public class RearrangeArrayElementsBySignBrute3 {
    public static void rearrange(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];
        int p=0,ne=n/2;
        for(int i = 0; i<n; i++){
            if(nums[i]>=0) arr[p++] = nums[i];
            else{
                arr[ne++] = nums[i];
            }
        }
        p=0;
        for(int i = 0; i<arr.length/2; i++){
           nums[2*i] = arr[p];
           nums[2*i+1] = arr[(p+n/2)];
           p++;

        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        rearrange(arr);
        for(int e: arr) System.out.print(e+" ");
    }
}


