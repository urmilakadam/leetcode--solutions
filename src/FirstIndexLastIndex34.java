import java.util.Arrays;

public class FirstIndexLastIndex34 {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        Arrays.stream(searchRange(nums, target)).forEach(System.out::println);
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] indices = new int[2];
        indices[0] = -1;
        indices[1] = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target) indices[0] = mid;
            if(nums[mid]>=target) right = mid - 1;
            else left = mid + 1;
        }

        left = 0;
        right = nums.length - 1;

        while(left <= right){
            int mid = (right + right) / 2;
            if(nums[mid] == target) indices[1] = mid;
            if(nums[mid]<=target) left = mid + 1;
            else right = mid - 1;
        }
        return indices;
    }
}
