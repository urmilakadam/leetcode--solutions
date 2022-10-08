import java.util.Arrays;

public class TwoSum167 {

    public static void main(String[] args) {
        int arr[] = {1,3,4,6,7,8,9,10,34};
        int[] result = twoSum2(arr, 12);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum1(int[] numbers, int target) {

        int [] result = new int[2];

        for(int i=0; i < numbers.length; i++){
            result[0] = i+1;
            for(int j=i+1; j<numbers.length && numbers[i] <= target; j++){
                if( numbers[i] + numbers[j] == target){
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }


    public static int[] twoSum2(int[] numbers, int target) {

        int [] result = new int[2];
        int high = numbers.length-1;
        int low = 0;

        while(high > low){
            int sum = numbers[high] + numbers[low];
            if(sum == target){
                result[0] = low+1;
                result[1] = high+1;
                return result;
            }
            else if(sum > target){
                high--;
            }else{
                low++;
            }
        }
        return result;

    }

}
