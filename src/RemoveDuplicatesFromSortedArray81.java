import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class RemoveDuplicatesFromSortedArray81 {

    public static void main(String[] args) {
        int arr[] = {2,2, 4, 4};

        int result = removeDuplicates(arr);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {

        int start=0, end=0;

        for(int i=0; i<nums.length; i++){
            nums[start++] = nums[i];
            int count=0;
            for(int j=i; j<nums.length; j++){
                if(nums[i] == nums[j] && count<2){
                    nums[start] = nums[j];
                    start=start+1;
                    ++count;
                }
                else if(nums[i] != nums[j]){
                    break;
                }
                else{
                    count++;
                }
            }
            i = i + count;
        }
        return start-1;
    }



    public int singleNumber(int[] nums) {

//        Map<Integer, Long> stringLongMap = Arrays.stream(nums)
//                .collect(groupingBy(i->(int)i, counting()));


         return 0;
    }



}
