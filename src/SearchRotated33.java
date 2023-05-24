public class SearchRotated33 {
    public static void main(String[] args) {
        int[] nums ={4,5,6,7,0,1,2};
        System.out.println(search(nums, 3));
    }


    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        if(nums.length == 1) return target == nums[0]? 0 : -1;

        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target) return mid;
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target <= nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }else{
                if(nums[mid] <= target && nums[right] >= target){
                    left = mid + 1;
                }else right = mid-1;
            }
        }
        return -1;
    }
}
