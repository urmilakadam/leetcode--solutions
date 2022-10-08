import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,5,4,7,6,8};
        Arrays.stream(twoSum(arr, 12)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i=0;i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++ ){
                if(nums[i]+nums[j] == target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }


    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> map= new HashMap<>();

        for(int i=0;i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int secondNumber= target-nums[i];

            if(map.containsKey(secondNumber) && map.get(secondNumber)!=i){
                result[0]=i;
                result[1]= map.get(secondNumber);
                break;
            }
        }

        return result;
    }
}