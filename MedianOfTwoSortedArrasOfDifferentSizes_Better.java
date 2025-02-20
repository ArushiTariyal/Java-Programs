public class MedianOfTwoSortedArrasOfDifferentSizes_Better {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int cnt = 0;
            int n = nums1.length + nums2.length;
            int i = 0, j = 0;
            int ind1 = (n/2)-1, ind2 = n/2;
            int el1 = -1, el2 = -1;

            while(i<nums1.length && j<nums2.length){
                if(nums1[i]<=nums2[j]){
                    if(cnt == ind1) el1 = nums1[i];
                    if(cnt == ind2) el2 = nums1[i];
                    i++;
                    cnt++;
                }
                else{
                    if(cnt == ind1) el1 = nums2[j];
                    if(cnt == ind2) el2 = nums2[j];
                    j++;
                    cnt++;
                }
            }
            while(i<nums1.length){
                if(cnt == ind1) el1 = nums1[i];
                if(cnt == ind2) el2 = nums1[i];
                i++;
                cnt++;
            }
            while(j<nums2.length){
                if(cnt == ind1) el1 = nums2[j];
                if(cnt == ind2) el2 = nums2[j];
                j++;
                cnt++;
            }
            float median = -1;
            if(n%2==0){
                median = (el1 + el2)/2.0f;
            }
            else{
                median = el2;
            }
            return median;
        }
    }
}
