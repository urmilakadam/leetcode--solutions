import java.util.*;

public class UncrossedLines1035 {

    public static void main(String[] args) {
        int[] nums1 = {1,3,7,1,7,5};
        int[] nums2 = {1,9,2,5,1};
        System.out.println(maxUncrossedLines(nums1, nums2));
    }

    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int result = 0;
        int count = 0;

        for(int i=0; i<nums1.length; i++){
            for(int j = count; j<nums2.length; j++){
                if(nums1[i] == nums2[j]) {
                    result++;
                    count = j;
                    break;
                }
            }
            if(count == nums2.length-1) break;
        }
        return result;
    }
}
