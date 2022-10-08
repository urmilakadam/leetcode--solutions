import java.util.Arrays;

public class MoveZeros283 {

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,0,0,4,5,6};
       // Arrays.stream(moveZeroes1(arr)).forEach(System.out::println);
        Arrays.stream(moveZeroes2(arr)).forEach(System.out::print);

    }

    public static int[] moveZeroes1(int[] nums) {

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                for(int j=i+1; j<nums.length; j++) {
                    if(nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static int[] moveZeroes2(int[] nums) {

        int sorted=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
               nums[sorted++] = nums[i];
            }
        }

        for(int i=sorted; i<nums.length; i++){
                nums[sorted++] = 0;
        }

        return nums;
    }

}
