import java.util.Arrays;

public class ProductArray238 {

    public static void main(String[] args) {
        int []nums = {1,2,3,4};

        int[] productExceptSelf = productExceptSelf(nums);

        System.out.println(Arrays.toString(productExceptSelf));
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int []result = new int[len];
        int []left = new int[len];
        int []right = new int[len];

        left[0] = nums[0];
        for(int i = 1; i<len; i++){
            left[i] = left[i-1] * nums[i];
        }

        right[len - 1] = nums[len - 1];
        for(int i = len - 2; i>=0; i--){
            right[i] = right[i+1] * nums[i];
        }

        result[0] = right[1];
        result[len-1] = left[len-2];

        for(int i = 1; i<len-1; i++){
            result[i] = left[i-1] * right[i+1];
        }

        return result;
    }

}
