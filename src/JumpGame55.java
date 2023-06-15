public class JumpGame55 {
    public static void main(String[] args) {
        int[] nums = {2,0,0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {

        if(nums.length == 1) return true;
        int count = 0;
        while(count<nums.length){
            int val = nums[count];
            count = count + val;
            if(count<nums.length && nums[count] == 0) break;
        }
        if(count >= nums.length) return true;
        else{
            while(count<=nums.length){
                if(nums[count] == 0 ){
                    if(count == nums.length-1) {
                        count++;
                        break;
                    }
                    if(count+1 < nums.length && nums[count+1] == 0)
                        count++;
                    else break;
                }
                else break;
            }
        }
        return count >= nums.length;
    }
}
