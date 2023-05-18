import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MedianOfSortedArray4 {

    public static void main(String[] args) {
        int arr[] = {2,2, 4, 4};
        int arr1[] = {2,2,4,4};

        System.out.println(findMedianSortedArrays(arr, arr1));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size = nums1.length + nums2.length;
        int merge[] = new int[size];
        int i=0,j=0, count=0;

        while(count<size/2+1){
            if(i < nums1.length && j < nums2.length){
                if(nums1[i]<nums2[j]){
                    merge[count++] = nums1[i];
                    i++;
                }
                else if(nums1[i]==nums2[j]){
                    merge[count++] = nums1[i];
                    merge[count++] = nums2[j];
                    j++; i++;
                }
                else if(nums1[i]>nums2[j]){
                    merge[count++] = nums2[j];
                    j++;
                }
            }

            else if(i < nums1.length && j >= nums2.length){
                merge[count++] = nums1[i]; i++;
            }
            else if(i >= nums1.length && j < nums2.length){
                merge[count++] = nums2[j]; j++;
            }
        }

        if(size%2 != 0) return merge[--count];
        else return (double)(merge[size/2] + merge[size/2-1]) / 2;
    }

    public int singleNumber(int[] nums) {

        return Arrays.stream(nums)
               .boxed()
               .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
               .entrySet()
               .stream()
               .filter(i->i.getValue()==1)
               .map(i->i.getKey())
               .findAny().orElse(0);
    }
}
