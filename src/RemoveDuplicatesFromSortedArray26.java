import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray26 {

//     Input: nums = [0,0,1,1,1,2,2,3,3,4]
//     Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//     Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//     It does not matter what you leave beyond the returned k (hence they are underscores).

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicate(arr);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int start=0, end=1;

        while(start<=end && end<nums.length){
            if(nums[start] == nums[end]){
                end++;
            }else if(nums[start] != nums[end]){
                nums[++start] = nums[end];
                end++;
            }
        }
        return start+1;

    }

    public static int removeDuplicate(int[] nums) {
        int index = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[index] != nums[i]){
                index++;
                nums[index] = nums[i];
            }
        }

        return index+1;
    }

}
