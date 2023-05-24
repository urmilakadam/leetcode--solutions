public class MinimumSize201 {

    public static void main(String[] args) {
        int target = 80;
        int [] nums ={10,5,13,4,8,4,5,11,14,9,16,10,20,8};
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int start = 0, sum = 0;
        int currentLen = 0;

        for(int end=0; end<nums.length; end++){
            sum += nums[end];
            while(sum >= target){
                currentLen = end - start + 1;
                min = Math.min(min, currentLen);
                sum = sum - nums[start];
                start++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
