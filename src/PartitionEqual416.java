import java.util.Arrays;

public class PartitionEqual416 {
    public static void main(String[] args) {
        int nums[] = {1,3,4,4};
        System.out.println(canPartition(nums));
    }

    public static boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int sum1=nums[left++], sum2=nums[right--];

        while(left <= right){
            if(sum1 >= sum2){
                sum2 = sum2 + nums[right];
                right--;
            }
            if(sum1 <= sum2) {
                sum1 = sum1 + nums[left];
                left++;
            }
            if(sum1 == sum2) return true;
        }
        return false;
    }
}
